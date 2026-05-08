package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals){
        // Sorting
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        List<int []> list = new ArrayList<>();
        int  [] current = intervals[0];

        for (int i = 1; i < intervals.length; i++){
            if (current[1] >= intervals[i][0]){
                current[1] = Math.max(current[1], intervals[i][1]);
            }else {
                list.add(current);
                current = intervals[i];
            }
        }
        list.add(current);
        return list.toArray(new int [list.size()][2]);
    }
    // Time O(nlogn)
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}}; // Output: [[1,6],[8,10],[15,18]]
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
