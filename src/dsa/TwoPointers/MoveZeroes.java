package dsa.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] nums = {0,0,1,2,0,5}; //Output: [1,2,5,0,0,0]
        System.out.println(Arrays.toString(moveZero(nums)));
    }
    public static int[] moveZero(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for(int num : nums){
            if(num != 0){
                temp.add(num);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < temp.size()){
                nums[i] = temp.get(i);
            }else {
                nums[i] = 0;
            }
        }
        return nums;
    }
}
