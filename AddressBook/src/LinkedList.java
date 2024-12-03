public class LinkedList {
    private Node head = null;

    // Add a new node with the given integer value
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the entire linked list
    public void display() {
        if (head == null) {
            System.out.println("empty list");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current);
                current = current.next;
            }
        }
    }
}
