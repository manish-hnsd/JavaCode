package dsa.TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*Given a string str of size N, the task is to print the number of substrings
formed after maximum possible partitions such that no two substrings have a
common character. Complete the function below to return the number of such
sub-strings.

Input : str = “ababcbacadefgdehijhklij”

Output : 3
Explanation:
Partitioning at the index 8 and at 15 produces three substrings
“ababcbaca”, “defegde” and “hijhklij” such that none of them have a
common character. So, the maximum partitions is 3.

Input: str = “aaa”
Output: 1*/
public class PartitionLabels {
    public static int maxPartitions(String s) {
        // Store last occurrence of every character
        Map<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }
        int count = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Find farthest last occurrence
            end = Math.max(end, lastIndex.get(s.charAt(i)));
            // Partition point
            if (i == end) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefgdehijhklij";
        int result = maxPartitions(s);
        System.out.println(result);
    }
}
