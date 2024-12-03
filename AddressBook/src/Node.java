public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null; // Initialize next as null
    }

    @Override
    public String toString() {
        return "data=" + data;
    }
}
