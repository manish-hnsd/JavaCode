package dsa.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFreqElement {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3}; // Input
        int k  = 2;
        //Output [1,2]
        // Count Freq
        Map<Integer, Integer>  map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num, 0) + 1);
        }
        // Sorting
        List<int []> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer>  entry : map.entrySet()) {
            list.add(new int[] {entry.getValue(), entry.getKey()});
        }
        list.sort((a,b) -> b[0] - a[0]);
        int[] result =  new int[k];
        for(int i = 0; i < k; i++){
            result[i] = list.get(i)[1];
        }
        System.out.println(Arrays.toString(result));
        // Using Stream APi
        /*List<Integer> result = Arrays.stream(arr).boxed() // int → Integer
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(k).map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(result);*/
    }

}
