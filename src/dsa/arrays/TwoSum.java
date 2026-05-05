package dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int target = 7;  // Output: [0,1]
        System.out.println(Arrays.toString(twoSum(nums, target)));
        // ⏱️ Time Complexity: O(n2)
        /*for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
//                    System.out.println(Arrays.toString(new int[]{i,j}));
                }
            }
        }*/
    }
    // ⏱️ Time Complexity: O(n)
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target-nums[i];

            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
