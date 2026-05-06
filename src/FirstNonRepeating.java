import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "aabbcde";

        Map<Character, Integer> mapStr = new HashMap<>();
        for (Character c : str.toCharArray()){
            mapStr.put(c, mapStr.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : mapStr.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
        Character ch = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function
                .identity(),LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(entry -> entry
                .getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(ch);
    }
}
