//A map is just a set of keys-values pairs.
//HashMap<> key-value types have to be java class, not premitive data types. like int, long, fload. Use full wrapper classes like INTEGER, Float, Long etc.
//Map is interface. What kind of map if method a real map implemetation can support. HASHMAP is one of its interface.
//Order in a map is not specific, according to the order you define them.
//Map will take the new value of the key and override it with the new value.
//Put wil add a key value pair and update the pair if that key exist in the map.
//Replace - only replace the current values, and updates it, but a put can replacve if exist and if not exist then it will add it in the map too.
//putIfAbsent - update/add a key value pair only if it's not in map.

package HashMaps;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>(); //in older verions of java, we have to specify in the variables in the new hashmaps. But from java 7 n later just use <> operator and java will infer automaticaly from the object side which you declare.
        empIds.put("Ankit", 12345);
        empIds.put("Sunny", 54321);
        empIds.put("Dev", 34522);
            System.out.println(empIds);
            System.out.println(empIds.get("Ankit"));
            System.out.println(empIds.containsKey("Ankit"));
            System.out.println(empIds.containsValue(23));
        empIds.put("Dev", 100012);
            System.out.println(empIds);
        empIds.putIfAbsent("Ankit", 100012);
            System.out.println(empIds);
        empIds.remove("Dev");
            System.out.println(empIds);
    }
}
