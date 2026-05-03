public class FibonacciSeries {
    void fibonacciSeries (){
        int n = 10, num1 = 0, num2 = 1;
        System.out.print ("Fibonacci Series = ");
        for (int i = 0; i < n; i++){
            System.out.print (num1 + " ");
            int num3 = num1 + num2;
            num2 = num1;
            num1 = num3;
        }
        System.out.println();
    }
}
