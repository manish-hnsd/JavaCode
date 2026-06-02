package dsa.DP;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] num = {2,-3,4,-2,2,1,-1,4};
        int sum = maxSubArray(num);
        System.out.println(sum);
    }
    //Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        int maxSub = nums[0], curSum = 0;
        for (int num : nums) {
            if (curSum < 0){
                curSum = 0;
            }
            curSum += num;
            maxSub = Math.max(curSum, maxSub);
        }
        return maxSub;
    }
}
