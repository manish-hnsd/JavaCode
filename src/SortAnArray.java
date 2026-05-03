public class SortAnArray {
    void sortAnArray (){
        int arr[] = new int[]{ 2, 22, 44, 3 };
        for (int j = 0; j < arr.length; j++){
            for (int i = 0; i < arr.length - 1; i++){
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.print ("Sorted Array = ");
        for (int i:arr){
            System.out.print (i + " ");
        }
        System.out.println ();
    }
}
