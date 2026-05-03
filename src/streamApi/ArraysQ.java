package streamApi;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class ArraysQ {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,4,7,1,2,6,5,8);
        Set<Integer> set = new HashSet<>();
        // Duplicate Number
        List<Integer> duplicate = numbers.stream().filter(n-> !set.add(n)).distinct().collect(Collectors.toList());
        // Second Highest
        Integer secondHig = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(duplicate);
        System.out.println(secondHig);
    }
}
