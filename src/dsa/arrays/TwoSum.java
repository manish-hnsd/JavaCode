package dsa.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int target = 7;  // Output: [0,1]
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println(Arrays.toString(new int[]{i,j}));
                }
            }
        }

    }
}
