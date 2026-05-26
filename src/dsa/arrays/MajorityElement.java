package dsa.arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {5,5,1,1,1,5,5}; // Output: 5
        int majority = majorityElement(arr);
        System.out.println(majority);
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int res = 0, maxCount = 0;
        for (int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > maxCount){
                res = num;
                maxCount = count.get(num);
            }
        }
        return res;
    }
}
