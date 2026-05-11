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
//        Integer secondHig = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        Integer secHig = numbers.stream().sorted((a,b) ->  b  - a).skip(1).findFirst().get();
        System.out.println(duplicate);
        System.out.println(secHig);
//        System.out.println(secondHig);
        // Second Smallest
        Optional<Integer> secondSmall = numbers.stream().sorted().distinct().skip(1).findFirst();
        if(secondSmall.isPresent()){
            System.out.println("Second Small No is :" + secondSmall.get());
        }else
        System.out.println("Second Smallest Not Present");
    }
}