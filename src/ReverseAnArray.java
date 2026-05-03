public class ReverseAnArray {
    void reverseAnArray (){
        int arr[] = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.print ("Reverse An Array = ");
        int start = 0, end = arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            int temp;
            if (start < end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            System.out.print (arr[i] + " ");
        }
        System.out.println ();
    }
}
