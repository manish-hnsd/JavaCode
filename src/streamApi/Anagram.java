package streamApi;

import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String s = "apple" ;//"anagram";
        String t = "apples"; //"nagaram";
        // Output
        System.out.println(isAnagram(s, t)); // true
    }
    // Time: O(n) Space: O(1)
    // without using inbuilt function
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        // Create a frequency counter for ASCII characters
        int[] count = new int[256];

        //Pass through both the strings
        for (int i = 0; i < s1.length(); i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        // Check if all counts returned to zero
        for (int val : count){
            if (val != 0){
                return false;
            }
        }
        return true;
    }
}
