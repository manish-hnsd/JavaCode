public class CheckPrime {
    void checkPrime (){
        int i, j, flag;
        System.out.print ("Prime Number = ");
        for (i = 1; i <= 100; i++){
            // Skip 1 as it is not a prime number
            if (i == 1){
                continue;
            }
            flag = 1;
            for (j = 2; j <= i / 2; j++){
                if (i % j == 0){
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){
                System.out.print (i + " ");
            }
        }
        System.out.println ();
    }
}
