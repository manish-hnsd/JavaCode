package dsa.TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);  // Output: true
    }
    public static boolean isPalindrome(String s) {
        int left = 0, right =s.length() - 1;
        while (left < right){
            while (left < right && !alphaNumeric(s.charAt(left))){
                left++;
            }
            while (right > left && !alphaNumeric((s.charAt(right)))){
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean alphaNumeric(char ch){
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }
}
