public class SecondLargest {
    int arr[] = new int[]{ 2, 22, 44, 3 };
    int first = Integer.MIN_VALUE, second = Integer.MAX_VALUE;
    void findSecondLargest() {
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println ("Second Largest = " + second);
    }
}