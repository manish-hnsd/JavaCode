package dsa.LinkedList;

public class LinkedListReversal {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void traverse(Node head) {
        Node current = head; // Start at the head

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
//        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        traverse(head); // Output: 10 -> 20 -> 30 -> null
    }

}
