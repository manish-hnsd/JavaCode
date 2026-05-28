import java.util.HashMap;
import java.util.Map;

public class LrUCache {
    public static void main(String[] args) {
        LrUCache lrUCache = new LrUCache(3);
        lrUCache.put(1, 10);
        lrUCache.put(2, 20);
        lrUCache.put(3, 30);
        lrUCache.display();
        lrUCache.get(1);
        lrUCache.put(4, 40);
        lrUCache.display();
    }
    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private int capacity;
    private Map<Integer, Node> map;

    private Node head;
    private Node tail;

    public LrUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }
    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            remove(map.get(key));
        }

        if (map.size() == capacity) {

            Node lru = tail.prev;

            remove(lru);
            map.remove(lru.key);
        }

        Node newNode = new Node(key, value);

        insert(newNode);

        map.put(key, newNode);
    }

    private void remove(Node node) {

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public void display() {

        Node current = head.next;

        while (current != tail) {
            System.out.print(
                    "[" + current.key + "=" + current.value + "] "
            );
            current = current.next;
        }

        System.out.println();
    }
}