public class AlternatePrimeNumber {
    void alternatePrimeNumber (){
        System.out.print ("Alternate Prime Number = ");
        boolean isPrime = true;
        boolean isFirstPrime = true;
        for (int i = 2; i <= 50; i++){
            isPrime = true;
            for (int j = 2; j <= i / 2; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                if (isFirstPrime){
                    System.out.print (i + " ");
                    isFirstPrime = false;
                }
                else{
                    isFirstPrime = true;
                }
            }
        }
        System.out.println ();
    }
}