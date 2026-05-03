import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    void characterCount (){ //**Imp
        HashMap< Character, Integer > charCount = new HashMap <> ();
        String str = "Hello World";
        char[] strChar = str.toCharArray ();
        for (char c:strChar){
            if (charCount.containsKey (c)){
                charCount.put (c, charCount.get (c) + 1);
            }else{
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as its value
                charCount.put (c, 1);
            }
        }// Printing the charCountMap
        System.out.println ("Character count:");
        for (Map.Entry entry:charCount.entrySet ()){
            System.out.println (entry.getKey () + " - " + entry.getValue ());
        }
        //Printing Maximum Char in a String
        char maxChar = '\0';
        int maxFreq = 1;
        for (Map.Entry < Character, Integer > entry:charCount.entrySet ()){
            char c = entry.getKey();
            int freq = entry.getValue();
            if (freq > maxFreq){
                maxChar = c;
                maxFreq = freq;
            }
        }
        System.out.println ("The maximum repeating character in \"" + str +
                "\" is '" + maxChar + "'");
    }
}
