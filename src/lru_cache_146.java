import java.util.HashMap;

public class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class lru_cache_146 {
    private HashMap<Integer, Node> cache;
    private int cap;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.cap = capacity;
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public void remove(Node node) {
        Node p = node.prev;
        Node n = node.next;
        p.next = n;
        n.prev = p;

    }

    public void insert(Node node) {
        Node front = this.right.prev;
        front.next = node;
        node.prev = front;
        this.right.prev = node;
        node.next = this.right;

    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);
        if (cache.size() > cap) {
            Node l = this.left.next;
            remove(l);
            cache.remove(l.key);
        }
    }
}
