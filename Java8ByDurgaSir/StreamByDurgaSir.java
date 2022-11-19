// Streams:
//---------
//Collection & Stream:
//--------------------
// Coolection is a groupd of objects.
//  Collection need - If we want to represent a group of objects as a single entity then we should go for collection.
//  Stream is a interface present in java.util.stream package.
//  Stream s = c.stream() // c = collection, stream is a method itself.
//  Stream need - If we want to process objects from collection.
//          Filter object - Filter takes a predicate as an argument so basically you are validating your input/collection against a condition.
//          Map object - for every object if you want to perform some function and you want some result object, we go for map.
//  If you want to be objects, process objects from collection the we should go for stream.
//  Best advantage of stream/lambda - very consise code (short code/less no of line code).
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

package Java8ByDurgaSir;

import java.util.*;
import java.util.stream.*;

public class StreamByDurgaSir {
    public static void main(String[] args) {
        //filter
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
            System.out.println("A list: " + list1);
        List<Integer> list2 = list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList()); //.filter('predicate condition') predicate is a boolen and it is functional interface, and function interface can be replaced with lambda expresion. Then we have to collect the data by a collector method in to a list.
            System.out.println("Even no list: " + list2);

        //map
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(0);
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);
        marks.add(5);
        marks.add(6);
        marks.add(7);
        marks.add(8);
        marks.add(9);
        marks.add(10);
            System.out.println("Marks: " + marks);
        List<Integer> updateMarks = marks.stream().map(i -> i+5).collect(Collectors.toList());
            System.out.println("5 Garce Marks:" + updateMarks);
    }
}
