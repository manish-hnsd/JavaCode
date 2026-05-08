package dsa.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    // Time Complexity O(n)
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int right =0; right<s.length(); right++){
            if (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max,  right - left + 1);
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
