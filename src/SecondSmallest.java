public class SecondSmallest {
    int[] arr = {1,1,1,1,8,5,2};

    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    public void getSecondSmallest(){
        for (int num : arr){
            if (num < smallest){
              secondSmallest= smallest;
              smallest = num;
            }else if (num < secondSmallest && num != smallest){
                secondSmallest = num;
            }
        }
        if(secondSmallest == Integer.MAX_VALUE){
            System.out.println("Second Smallest not Present in Array. ");
        }else{
            System.out.println("Second Smallest = " + secondSmallest);
        }

    }

}
