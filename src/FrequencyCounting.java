import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FrequencyCounting {
    public static void main(String[] args) {
        // Time Complexity O(n)
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        // Create HashMap to Store Elements
        HashMap<String, Integer> mapCount = new HashMap<>();
        // Count Occurence
        for(String str : list){
            mapCount.put(str, mapCount.getOrDefault(str, 0) + 1);
        }
        // Prints Result
        for (HashMap.Entry<String, Integer> entry :  mapCount.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Count character occurrences in a string
        String str = "apple";
        HashMap<Character, Integer> mapStr = new HashMap<>();
        for(char c : str.toCharArray()){
            mapStr.put(c, mapStr.getOrDefault(c, 0) + 1);
        }
        System.out.print("Character Frequency in "+ str + " : ");
        System.out.print(mapStr);
    }
}
