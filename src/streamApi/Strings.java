package streamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Strings {
    public static void main(String[] args) {
        lower2Upper();
        sort();
        characterCount();
        charCountString();
        reverseAString();
        findVowels();
    }
    static void lower2Upper(){ //Lower to Upper Case
        List<String>  list = Arrays.asList("abcd");
        List<String> result = list.stream().map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(result);
    }
    static void sort(){ //Sort in descending order
        List<String> list = Arrays.asList("abcd");
//        List<String> result = list.stream().map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.toList());
        List<String> result2 = list.stream().map(str -> str.chars().mapToObj(c -> String.valueOf((char) c))
                .sorted(Comparator.reverseOrder()).collect(Collectors.joining())).toList();
//        System.out.println(result2);
    }
    static void characterCount(){ // Occurrence of Char
        List<String>  list = Arrays.asList("aabbcde");
        Map<Character, Long> charCount = list.stream().flatMap(str -> str.chars().mapToObj(c -> (char) c))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(charCount);
    }
    static void charCountString(){// Occurrence of Char
        String str = "Manish"; //Using Stream
        Map<String,Long> result = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
//        System.out.println(result);
    }
    static void reverseAString(){ // Reverse a String
        String str = "Manish";
        String reverse = str.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (a,b) -> b+a);
//        System.out.println(reverse);
    }
    static void firstNonRepeatedCharacter(){ //First Non-Repeating Char
        String str = "aabbcde";
        Character result = str.chars().mapToObj(c -> (char) c) //Convert into char
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, //maintain insertion order
                        Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1) //first non-repeated
                .map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(result);
    }
    static void findVowels(){
        String str = "Manish"; // Find vowels from a string
        String vowels = str.chars().mapToObj(c -> String.valueOf((char) c))
                .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1).collect(Collectors.joining());
        System.out.println(vowels);
    }
}