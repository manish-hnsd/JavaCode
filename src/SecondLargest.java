public class SecondLargest {
    int arr[] = new int[]{ 2, 22, 44, 3 };
    int first = 0, second = 0;
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