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
    }
    static void lower2Upper(){ //Lower to Upper Case
        List<String>  list = Arrays.asList("abcd");
        List<String> result = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);
    }
    static void sort(){ //Sort in descending order
        List<String> list = Arrays.asList("abcd");
        List<String> result = list.stream().map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.toList());
        System.out.println(result);
    }
    static void characterCount(){ // Occurrence of Char
        List<String>  list = Arrays.asList("a","a","b","b","c","d","e");
        Map<String, Long> charCount = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);
    }
    static void charCountString(){// Occurrence of Char
        String str = "Manish"; //Using Stream
        Map<String,Long> result = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println(result);
    }
    static void reverseAString(){ // Reverse a String
        String str = "Manish";
        String reversed = str.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.collectingAndThen(Collectors.toList(),
                list -> {java.util.Collections.reverse(list); return String.join("", list);}));
        System.out.println(reversed);
    }
    static void firstNonRepeatedCharacter(){ //First Non-Repeating Char
        String str = "aabbcde";
        Character result = str.chars().mapToObj(c -> (char) c) //Convert into char
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, //maintain insertion order
                        Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1) //first non-repeated
                .map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(result);
    }
}