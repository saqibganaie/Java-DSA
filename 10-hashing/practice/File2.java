
// HashMap :- A HashMap refers to a data structure that provides a way to store and retrieve data using key-value pairs. It is often based on the concept of a hash table, which allows for efficient insertion, deletion, and retrieval of data.
//Key-Value Pairs: Stores data in the form of key-value pairs.
//
//Hashing: Uses a hash function to map keys to indices in an array or similar structure.
//
//Array or Buckets: Internally relies on an array or an array of linked lists (buckets) to organize data.
//
//Collision Resolution: Handles collisions using techniques like separate chaining or open addressing.
//
//Efficiency: Offers average-case constant-time complexity for basic operations (insertion, deletion, retrieval).
//
//Load Factor: Utilizes a load factor to determine when to resize the underlying data structure.
//
//No Order Guarantee: Does not guarantee any specific order of key-value pairs.
//
//Null Keys and Values: Allows one null key and multiple null values.

import java.util.*;

public class File2 {
    public static void main(String[] args) {
        // Creating a HashMap
        // key -> Country name, value -> country population
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion of (key, value) pairs
        map.put("India", 10000);
        map.put("USA", 20000);
        map.put("Russia", 30000);

        System.out.println(map);

        // Searching
        // 1. Searching if any key exists or not
        boolean mapHasKey = map.containsKey("India");
        if (mapHasKey) {
            System.out.println("Key exists");
        }

        // 2. Searching the value of certian key
        System.out.println(map.get("India"));
        System.out.println(map.get("China")); // returns null because "China" key does not exist

        // Iteration

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e);
            System.out.print(e.getKey());
            System.out.println(e.getValue());

        }

        // Another way of iteration

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println("Key : " + key + " Value : " + map.get(key));
        }

        // Deletion

        map.remove("India");
        System.out.println(map);
    }
}
