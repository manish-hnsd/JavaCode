package streamApi;

import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        // Output
        System.out.println(isAnagram(s, t)); // true
    }
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        // Store frequency map of first string in result1
        Map<Character, Long> result1 = s1.chars().mapToObj(c -> (char) c).collect(Collectors
                .groupingBy(ch -> ch, Collectors.counting()));

        // Store frequency map of second string in result2
        Map<Character, Long> result2 = s2.chars().mapToObj(c -> (char) c).collect(Collectors
                .groupingBy(ch -> ch, Collectors.counting()));

        // Compare both maps
        boolean result = result1.equals(result2);
        return result;
    }

}
