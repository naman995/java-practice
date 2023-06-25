package Hashmap.Basic;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 80);
        map.put("China", 100);

        // System.out.println(map);

        // Update value
        // map.put("China", 120);
        // System.out.println(map);

        // Search
        // if (map.containsKey("China")) {
        // System.out.println("The key is present in the Map");
        // } else {
        // System.out.println("Key is not present in the Map");
        // }

        // System.out.println(map.get("China")); // Key Exists
        // System.out.println(map.get("china"));// Key doesnot Exists

        // To remove key-value pair
        map.remove("China");
        System.out.println(map);

        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        // for (int val : arr) {
        // System.out.print(val + " ");
        // }

        // using Entry Set
        // for (Map.Entry<String, Integer> e : map.entrySet()) {
        // System.out.printf(e.getKey());
        // System.out.println(e.getValue());
        // }

        // using SetKeys
        // Set<String> keys = map.keySet();
        // for (String key : keys) {
        // System.out.println(key + " " + map.get(key));
        // }

    }
}