package dsa.TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
//        int[] heights = {1,7,2,5,4,7,3,6};  // Outpot = 36
        int[] heights = {1,3,2,5,2};
        int result = maxArea(heights);
        System.out.println(result);
    }
    public static int maxArea(int[] heights) {
        int res = 0;
        int left = 0, right = heights.length - 1;
        while (left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            res = Math.max(res, area);
            if(heights[left] < heights[right]){
                left++;
            }else {
                right--;
            }
        }
        return res;
    }

}
