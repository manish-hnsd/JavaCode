package dsa.arrays;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        boolean hasDuplicate = Arrays.stream(nums).distinct().count() < nums.length;
        System.out.println(hasDuplicate);
    }
}
