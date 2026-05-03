import java.util.Arrays;
import java.util.Collections;

public class ReverseASentance {
    void reverseASentance (){
        String text = "My Name Manish";
        String str[] = text.split (" ");
        Collections.reverse (Arrays.asList (str));
        System.out.println ("Reversing a Sentance = " + String.join (" ", str));
    }

}
