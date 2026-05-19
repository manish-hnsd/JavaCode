package dsa.BitManipulation;

import java.util.Arrays;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0},{1, 0, 1},{0, 0, 0}};
        int[][] result = flipAndInvertImage(image);
        // Print the matrix
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        } // Expected Output: [1, 0, 0] [0, 1, 0] [1, 1, 1]
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image) {
            int left = 0;
            int right = n-1;
            //Move Partitions towards the center
            while (left <= right){
                if (row[left] == row[right]){ //Both will change their upon inversion
                    int temp = row[left]^1; // We XOR with 1 to flip 0->1 and 1->0.
                    row[left] = temp;
                    row[right] = temp;
                }
                // Trick: If row[left] != row[right], after a simultaneous
                // flip and invert, their values wouldn't change at all!
                // So we do nothing if they are different.
                left++;
                right--;
            }
        }
        return image;
    }
}
