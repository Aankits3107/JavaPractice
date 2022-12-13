package Java8ByDurgaSir;

import java.util.stream.Collectors;
import java.util.*;  

public class StreamPractise {  
    public static void main(String args[]) {
        String myString= "Hello My Name is Ankit";
        List<Integer> myNumber = Arrays.asList(10, 1, 7, 4, 4, 100, 6, 1, 7, 8, 1, 10, 0, 56, 22, 19, 20, 3, 0);

        // 1. Print sum of all numbers
        Optional<Integer> sumOfAllNumbers = myNumber.stream().reduce((i1, i2) -> i1 + i2);
            System.out.println("Sum of numbers: "+ sumOfAllNumbers.get());

        // 2. Print Average of the numbers        
        double averageOfAllNumbers = myNumber.stream().mapToInt(i -> i).average().getAsDouble();
            System.out.println("Average of numbers: " + averageOfAllNumbers);

        // 3. Square, Filter & Average of Numbers
        double squareFilterAverageOfNumbers = myNumber.stream().map(i -> i * i).filter(n -> n > 100).mapToInt(n -> n).average().getAsDouble();
            System.out.println("Square, Filter & Average of numbers: " + squareFilterAverageOfNumbers);
        
        // 4. Print Even Odd numbers
        List<Integer> evenNumbers = myNumber.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        List<Integer> oddNumbers = myNumber.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
            System.out.println("Even numbers: " + evenNumbers + " , Odd numbers: " + oddNumbers);

        // 5. Numbers starts with a specific no
        List<Integer> numberStartWith1 = myNumber.stream().map(i -> String.valueOf(i)).filter(n -> n.startsWith("1")).map(Integer :: valueOf).collect(Collectors.toList());
            System.out.println("Numbers starts with 1: " + numberStartWith1);

        // 6. Print duplicate numbers
        // Set<Integer> dupNo = new HashSet<>();
        // Set<Integer> duplicateNumber = myNumber.stream().filter(n -> !dupNo.add(i)).collect(Collectors.toSet());
        Set<Integer> duplicateNumber = myNumber.stream().filter(i -> Collections.frequency(myNumber, i) > 1).collect(Collectors.toSet());
            System.out.println("Duplicate numbers: " + duplicateNumber);
        
        // 7. Min & Max numbers
        int maxNumber = myNumber.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        int minNumber = myNumber.stream().min((i1, i2) -> i1.compareTo(i2)).get();
            System.out.println("Max number: " + maxNumber + ", Min Number: " + minNumber);

        // 8. Sort numbers
        List<Integer> sortNumberAsending = myNumber.stream().sorted().collect(Collectors.toList());
        // List<Integer> sortNumberAsending = myNumber.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
        List<Integer> sortNumberDesending = myNumber.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        // List<Integer> sortNumberDesending = myNumber.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        // List<Integer> sortNumberDesending = myNumber.stream().sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)).collect(Collectors.toList());
            System.out.println("Asending sorted Numbers: " + sortNumberAsending + ", Decending sorted numbers: " + sortNumberDesending);

        // 9. Get or ignore first 5 numbers using Limit & Skip in Streams
        List<Integer> limitNumber = myNumber.stream().limit(5).collect(Collectors.toList());
        int sumOfLimitNumber = myNumber.stream().limit(5).reduce((i1, i2) -> i1 + i2).get();
        List<Integer> skipNumber = myNumber.stream().skip(5).collect(Collectors.toList());
        int sumOfSkipNumber = myNumber.stream().skip(5).reduce((i1, i2) -> i1 + i2).get();
            System.out.println("Limit by 5: " + limitNumber + ", Sum of the limited numbers: " + sumOfLimitNumber + "\n Skiped number by 5 " + skipNumber + ", Sum of the skiped numbers: " + sumOfSkipNumber);

        // 10. Second highest or lowest number
        int secondHighest = myNumber.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        // int secondHighest = mynumber.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        int secondLowest = myNumber.stream().sorted().distinct().skip(1).findFirst().get();
            System.out.println("Second highest number: " + secondHighest + ", Second lowest number: " + secondLowest);


        // 11. Character Occurence in a String
        Map<String, Long> occurenceOfCharacter = Arrays.stream(myString.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));  
            System.out.println("Character occurence: " + occurenceOfCharacter);
    }  
}  
