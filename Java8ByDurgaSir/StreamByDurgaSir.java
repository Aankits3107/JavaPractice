// Streams:
//---------
//Collection & Stream:
//--------------------
// Coolection is a group of objects.
//  Collection need - If we want to represent a group of objects as a single entity then we should go for collection.
//  Stream is a interface present in java.util.stream package.
//  Stream s = c.stream() // c = collection, stream is a method itself.
//  Stream need - If we want to process objects from collection.
//          stream() method - to get the stream
//          filter() method - Filter takes a predicate as an argument so basically you are validating your input/collection against a condition.
//                          filter(predicate) retrun type is boolen. to perform conditional checks
//          map() method - For every object if you want to perform some function and you want some result object, we go for map.
//                       map(function) to do business logic, or to do some operation, generate some value.
//          collect() method - Collect the results into a list by Collectors.tolist().
//          count() method - to count how many elements are in a stream, we go for count.
//          sorted() method - for asending order use sorted(). Internally natural sorting order is working by comparable interface which have compateTo() method( i1.compareTo(i2) ).
//                          for desending order use comparator operator(its a functional operation).
//                          (i1,i2) - compare(obj1, obj2)
//                                  returns +ve if obj1 has to come before obj2 / obj2 has to come before obj1
//                                  returns -ve if obj1 has to come after obj2 / obj2 has to come after obj1
//                                  returns 0 if obj1 & obj2 are equal
//                          Desending - (i1,i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0
//                          Comparator() - uses lambda expression, customised sorting order
//          min() method - to find the min elements in a integer list, according to a comparator.
//          max() method - to find the max elements in a integer list, according to a comparator.
// To get array elements we can use - 
//                          forEach() method - always requires some function (functional interface so, we can send lambda expresion in here) to perform a required activity. For example if we need to access all element of a list. or to print all of them etc.
//                          toArray() method - to convert stream of objects/elements into arrays.
//                          Stream.of() method - to get a stream of an array[].
//                                              Wheres there is a group of elements or arrays are then we can go for stream.of concept.
//  If you want objects, process objects from collection the we should go for stream.
//  Best advantage of stream/lambda - very consise code (short code/less no of line code).

package Java8ByDurgaSir;

import java.util.*;
import java.util.stream.*; // whenever we are importring a package, all classes & interface are present by default but not sub-level packages classes & interfaces. So we need to access the sub-package level by importing it through main package..
import java.util.function.*; // sub-level package.

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
        //filter()
        List<Integer> EvenMarks = myList.stream().filter(i -> i%2 == 0).collect(Collectors.toList()); //.filter('predicate condition') predicate is a boolen and it is functional interface, and function interface can be replaced with lambda expresion. Then we have to collect the data by a collector method in to a list.  
            System.out.println("Even no Marks: " + EvenMarks);

        List<Integer> passingMarks = myList.stream().filter(i -> i > 3.5).collect(Collectors.toList()); //filetr for passing marks only.
            System.out.println("Passing marks: " + passingMarks );

        long noOfFailedStudent = myList.stream().filter(i -> i < 4).count(); // to count the no of failed student. No to for count() be collect to a list.
            System.out.println("Total Less then passing marks: " + noOfFailedStudent);

        //map()
        List<Integer> updateMarks = myList.stream().map(i -> i+5).collect(Collectors.toList());
            System.out.println("5 Garce Marks:" + updateMarks);

        //sort()
        //sorting in interger list
        //asending
        List<Integer> sortedMarksListAsending = myList.stream().sorted().collect(Collectors.toList()); //natural sorted order
        // List<Integer> sortedMarksListAsending = myList.stream().sorted((i1, i2) -> (i1.compareTo(i2))).collect(Collectors.toList());
        // List<Integer> sortedMarksListAsending = myList.stream().sorted((i1, i2) -> -(i2.compareTo(i1))).collect(Collectors.toList());
            System.out.println("Asending Sorted marks list: " + sortedMarksListAsending);

        //desending
        List<Integer> sortedMarksListDesending = myList.stream().sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)).collect(Collectors.toList()); //coustom sorted order - desending order by comparetor order.
        // List<Integer> sortedMarksListDesending = myList.stream().sorted((i1, i2) -> -(i1.compareTo(i2))).collect(Collectors.toList()); // can be done like this also by a -ve compareTo()
        // List<Integer> sortedMarksListDesending = myList.stream().sorted((i1, i2) -> (i2.compareTo(i1))).collect(Collectors.toList()); // can be done like this also by a reverse compareTo(), which is -ve only, bcz reverse order means -ve
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
    
        //min()
        Integer minValue = myList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        // Integer minValue = myList.stream().min((i1, i2) -> -i1.compareTo(i2)).get(); //reverse of min.
            System.out.println("Min value: " + minValue);

        //max()
        Integer maxValue = myList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        // Integer maxValue = myList.stream().max((i1, i2) -> -i1.compareTo(i2)).get(); //reverse of max
            System.out.println("Max value: " + maxValue);
        
        //forEach()
        myList.stream().forEach(System.out::println); // '::' constructor reference
        myStringList.stream().forEach(System.out::println);

        //custom function for forEach()
        Consumer<Integer> con = i -> {
                                        System.out.println("The square of " + i + " is " + (i * i));
                                    };
        myList.stream().forEach(con);

        //toArray()
        Integer[] myInteger = myList.stream().toArray(Integer[] :: new); // '::' constructor reference, here giving new reference variable by it.
        for(Integer i1 : myInteger) {
                System.out.println("Integer Array: " + i1);
        }

        String[] myString = myStringList.stream().toArray(String[] :: new); // '::' constructor reference, here giving new reference variable by it.
        for(String s1 : myString) {
                System.out.println("String Array: " + s1);

        //Stream.of()
        Stream.of(myInteger).forEach(System.out::println);
        Stream.of(myString).forEach(System.out::println);

        Stream<Integer> myStream = Stream.of(9, 99, 999, 9999, 99999);
            myStream.forEach(System.out::println);
            System.out.println(myStream); // retruns the address in memory

        Integer[] i = {10, 20, 30, 40, 50};
        Stream.of(i).forEach(System.out::println);
        }
    }
}

//Predicate interfaces - It compulsary take input type arrgument and return boolean. //boolean test(T t)
//
//Functional interface - It take input type argument and return value. R apply(T t)
//
//Consumer interface - It compulsary take some type arrgument. It contain abstarct method 'accept'. And it won't return anything. //void accept(T t).
// import java.util.function.Consumer;
// public class Test{
//     public static void main(String[] args) {
//         Consumer<String> c = s -> System.out.println(s);
//         c.accept("Hello");
//         c.accept("Ankit Sharma");
//     }
// }
//
//Supplier interface - It always gonna provide/return value. It won't take any input (not input type, but return type parameter). //get()
// import java.util.function.Supplier;
// public class Test{
//     public static void main(String[] args) {
//         Supplier<String> s = () -> {
//                                     String[] s1 = {"Sunny", "Bunny","Honey"};
//                                     int x = (int)(Math.random() * 3 + 1);
//                                     return s1[x];
//                                 };
//         System.out.println(s.get());
//         System.out.println(s.get());
//         System.out.println(s.get());
//     }
// }

// Stream operations are combined into pipelines to process streams.
// All operations are either intermediate or terminal.

// Intermediate operations
// -----------------------
// Those operations which return STREAM itseld, allowing for further operations on a stream.
// These streams are always LAZY. i.e, they do not process the stream at the call site.
//         an intermediate operatio  can only process data when there is a terminal operation.
//         eg: filter, map, flatMap.

// Terminal operations
// -------------------
// They terminate the pipeline & initate stream processing.
// They stream is passed through all intermediate operations during terminal operation call.
//     eg: forEach, reduce, collect, sum.