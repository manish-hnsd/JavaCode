import java.util.Arrays;

public class SortArray0s1sand2s {
    static void sort012(int[] arr) {
        // standard sorting function
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);

        for (int num : arr)
            System.out.print(num + " ");
    }
}