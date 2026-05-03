import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    void kthSmallest() {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        // Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Step 1: Add first k elements
        for (int i = 0; i < k; i++) {
            maxHeap.add(arr[i]);
        }
        // Step 2: Process remaining elements
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        // Top of heap is kth smallest
        System.out.println("Kth Smallest Element is: " + maxHeap.peek());
//        System.out.println(maxHeap.peek());
    }
}
