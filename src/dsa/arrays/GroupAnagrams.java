package dsa.arrays;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        // Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
        Map<String , List<String>> map = new HashMap<>();
        for(String str : strs){
            // Convert string to Char array
            char[] ch =  str.toCharArray();
            //Sort char
            Arrays.sort(ch);
            // Create key from Sorted Array
            String key = new String(ch);
            // Group Anagrams
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        // Output
        List<List<String>> result = new ArrayList<>(map.values());
        System.out.println(result);
    }
}
