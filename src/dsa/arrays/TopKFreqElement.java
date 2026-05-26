package dsa.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFreqElement {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,2,2,2,3,3,4,4,5,5,5}; // Input
        int k  = 2; //Output [1,2]
        // Count Freq
        Map<Integer, Integer>  map = new HashMap<>(); // Time Complexity O(n)
        for(int num : arr){
            map.put(num,map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a,b) -> map.get(b) - map.get(a) // This tells the PQ to prioritize elements with higher frequencies.
        );
        pq.addAll(map.keySet()); // Time Complexity O(d \log d) //Keys {1, 2, 3} are added.Because it's a
        // Max-Heap based on frequency, the PQ internal structure looks like this: [1, 2, 3] (since 3 > 2 > 1).
        int[] result =new int[k];
        for(int i=0; i<k; i++){
            result[i] =  pq.poll(); // Time Complexity O(k \log d)
        }
        System.out.println(Arrays.toString(result));
        // Overall Total Complexity: O(n + d \log d)
        // Using Stream APi
        List<Integer> result2 = Arrays.stream(arr).boxed() // int → Integer
                .collect(Collectors.groupingBy(Function.identity(),Collectors   .counting())) //Tallying how many times each number appears.
                .entrySet().stream()// Converts the map into a stream of key-value pairs so we can sort them.
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue())) // Compares values (3, 2, 1) in descending order.
                .limit(k)// Only keeps the first k (2) entries.
                .map(Map.Entry::getKey) // Discards the counts and keeps only the original numbers.
                .collect(Collectors.toList()); // Gathers the results into a final List.
        // Time Complexity O(n + d \log d)
        // Space Complexity: O(d)
        System.out.println(result2);
    }

}
