import java.util.ArrayList;
import java.util.List;

public class MinMaxSalary {
    void minAndMaxSalary (){
        List< Integer > list = new ArrayList<>();
        list.add (1000);
        list.add (3200);
        list.add (4500);
        list.add (2200);
        int min = list.get (0);
        int max = list.get (0);
        for (int i = 0; i < list.size (); i++){
            if (list.get (i) < min){
                min = list.get (i);
            }
        }
        for (int i = 0; i < list.size (); i++){
            if (list.get (i) > max){
                max = list.get (i);
            }
        }
        System.out.println ("Minimum Salary = " + min);
        System.out.println ("Maximum Salary = " + max);
    }
}