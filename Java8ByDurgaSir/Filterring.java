package Java8ByDurgaSir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Filterring {
	public static void main(String[] args) {
		List<Map<String,String>> students = new ArrayList<>();
		Map<String, String> data = new HashMap<>();
			data.put("John","Course_1");
			data.put("Mike","Course_3");
			data.put("Brute","Course_4");
			data.put("Mark","Course_2");
			data.put("Sebby","Course_1");

		students.add(data);
			data = new HashMap<>();
			data.put("Neil","Course_1");
			data.put("Kelton","Course_3");
			data.put("Mikael","Course_4");
			data.put("Micheal","Course_1");
			data.put("Brenote","Course_2");
		students.add(data);
	
		List<String> course1Students = students.stream().flatMap(map -> map.entrySet().stream()).filter(s -> s.getValue().equals("Course_1")).
										map(s -> s.getKey()).collect(Collectors.toList());
			System.out.println("Students with Course_1: " + course1Students);


		// Give value in map as key value pais, 2 approches:
		// List<String> s = List.of("Jay", "Amit", "Raj", "Ashok", "Jayesh");
		//1.
		// Map<String, List<String>> result = s.stream().filter(str -> str.startsWith("A")).collect(Collectors.groupingBy(str -> "A"));
		//2.
		// Map<String, List<String>> map = s.stream().filter(str -> str.startsWith("A")).collect(Collectors.groupingBy(str -> String.valueOf(str.charAt(0)), Collectors.toList()));
	
		// 	System.out.println(result);

		}
}
