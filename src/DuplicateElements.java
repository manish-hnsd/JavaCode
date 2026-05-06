import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 7, 8};

        System.out.println("Input Array: " + Arrays.toString(nums));
        findDuplicates(nums);
    }
    // Time Complexity O(n) Space Complexity O(n)
    static void findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        Set<Integer> duplicate = new HashSet<>();

        for (int num : nums){
            if (!seen.contains(num)){ // .add() returns false if the element already exists in the set
                duplicate.add(num);
            }
        }
        if (duplicate.isEmpty()){
            System.out.println("No duplicates");
        }else {
            System.out.println("Duplicates found"+duplicate);
        }
    }
}
