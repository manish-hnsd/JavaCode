public class ReverseAString {
    public static void main(String[] args) {
        String str = "Manish";
        System.out.println(reverseAWord(str));
    }
    public static String reverseAWord(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length()-1; i >= 0 ; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();

    }
}
