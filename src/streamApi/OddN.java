package streamApi;

public class OddN {
    public static void main(String[] args) {
        char [] num = {'1', '2', '3', '4', '5', 'A'};
        int sum = new String(num).chars()
                .map(Character::getNumericValue)
                .filter(n -> n%2 != 0).sum();
        System.out.println(sum);
        //Convert the character to a numeric value, filter odd numbers using streams, and then use sum() to calculate the total.
    }
}
