// Streams:
//---------
//Collection & Stream:
//--------------------
// Coolection is a groupd of objects.
//  Collection need - If we want to represent a group of objects as a single entity then we should go for collection.
//  Stream is a interface present in java.util.stream package.
//  Stream s = c.stream() // c = collection, stream is a method itself.
//  Stream need - If we want to process objects from collection.
//          Stream method - to get the stream
//          Filter method - Filter takes a predicate as an argument so basically you are validating your input/collection against a condition.
//                          filter(predicate) retrun type is boolen. to perform conditional checks
//          Map method - For every object if you want to perform some function and you want some result object, we go for map.
//                       map(function) to do business logic, or to do some operation, generate some value.
//          Collect method - Collect the results to list by Collectors.tolist().
//          Count method - to count how many elements in a stream, we go for count.
//          Sorted method - for asending order use sorted(). Internally natural sorting order is working by comparable interface which have compateTo() method( i1.compareTo(i2) ).
//                          for desending order use comparator operator(its a functional operation).
//                          (i1,i2) - compare(obj1, obj2)
//                                  returns +ve if obj1 has to come before obj2 / obj2 has to come before obj1
//                                  returns -ve if obj1 has to come after obj2 / obj2 has to come after obj1
//                                  returns 0 if obj1 & obj2 are equal
//                          Desending - (i1,i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0
//  If you want to be objects, process objects from collection the we should go for stream.
//  Best advantage of stream/lambda - very consise code (short code/less no of line code).

package Java8ByDurgaSir;

import java.util.*;
import java.util.stream.*;

public class StreamByDurgaSir {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(0);
        myList.add(3);
        myList.add(7);
        myList.add(2);
        myList.add(4);
        myList.add(5);
        myList.add(9);
        myList.add(1);
        myList.add(8);
        myList.add(6);
        myList.add(10);
            System.out.println("Marks list: " + myList);
        //filter
        List<Integer> EvenMarks = myList.stream().filter(i -> i%2 == 0).collect(Collectors.toList()); //.filter('predicate condition') predicate is a boolen and it is functional interface, and function interface can be replaced with lambda expresion. Then we have to collect the data by a collector method in to a list.  
            System.out.println("Even no Marks: " + EvenMarks);

        List<Integer> passingMarks = myList.stream().filter(i -> i > 3.5).collect(Collectors.toList()); //filetr for passing marks only.
            System.out.println("Passing marks: " + passingMarks );

        long noOfFailedStudent = myList.stream().filter(i -> i < 4).count(); // to count the no of failed student. No to for count() be collect to a list.
            System.out.println("Total Less then passing marks: " + noOfFailedStudent);

        //map
        List<Integer> updateMarks = myList.stream().map(i -> i+5).collect(Collectors.toList());
            System.out.println("5 Garce Marks:" + updateMarks);

        //sort
        //sorting in interger list
        //asending
        List<Integer> sortedMarksListAsending = myList.stream().sorted().collect(Collectors.toList()); //natural sorted order
        // List<Integer> sortedMarksListAsending = myList.stream().sorted((i1, i2) -> (i1.compareTo(i2))).collect(Collectors.toList());
            System.out.println("Asending Sorted marks list: " + sortedMarksListAsending);

        //desending
        List<Integer> sortedMarksListDesending = myList.stream().sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)).collect(Collectors.toList()); //coustom sorted order - desending order by comparetor order.
        // List<Integer> sortedMarksListDesending = myList.stream().sorted((i1, i2) -> -(i1.compareTo(i2))).collect(Collectors.toList()); // can ve done like this also by a -ve compareTo()
        // List<Integer> sortedMarksListDesending = myList.stream().sorted((i1, i2) -> (i2.compareTo(i1))).collect(Collectors.toList()); // can ve done like this also by a reverse compareTo(), which is -ve onle, bcz reverse order means -ve
            System.out.println("Decending Sorted marks list: " + sortedMarksListDesending);
        
        //Sorting in string list
        List<String> myStringList = new ArrayList<>();
        myStringList.add("Keanu Revese");
        myStringList.add("Bennedict Cumberbatch");
        myStringList.add("Robert Downey junior");
        myStringList.add("Jeniffer Lopez");
        myStringList.add("Dwane 'The Rock' Johnson");
            System.out.println("Actors list: "+ myStringList); 
        //acending
        // List<String> sortedActorListAsending = myStringList.stream().sorted().collect(Collectors.toList());      
        List<String> sortedActorListAsending = myStringList.stream().sorted((s1, s2) -> (s1.compareTo(s2))).collect(Collectors.toList());
            System.out.println("Asending Sorted Actors List: " + sortedActorListAsending);

        //desending
        List<String> sortedActorListDesending = myStringList.stream().sorted((s1, s2) -> -(s1.compareTo(s2))).collect(Collectors.toList());
        // List<String> sortedActorListDesending = myStringList.stream().sorted((s1, s2) -> (s2.compareTo(s1))).collect(Collectors.toList());        
            System.out.println("Desending Sorted Actors List: " + sortedActorListDesending);
        
        //increasing length order
        Comparator<String> comp = (s1, s2) -> {                         //lambda expression for increasing legth order
                                                int l1 = s1.length();
                                                int l2 = s2.length();
                                                if(l1 < l2)
                                                    return -1;
                                                else if(l1 > l2)
                                                    return 1;
                                                else
                                                    return s1.compareTo(s2);
                                            };
        List<String> increasingLength = myStringList.stream().sorted(comp).collect(Collectors.toList()); //alphabatical order is not consider.
            System.out.println("Order by increasing character length: " + increasingLength);
    }
}
