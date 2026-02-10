public class five {
    // Node definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Head of linked list
    static Node head;
    // Recursive reverse function
    static Node reverse(Node node) {
        // Base case
        if (node == null || node.next == null) {
            return node;
        }
        // Reverse rest of the list
        Node newHead = reverse(node.next);
        // Fix current node
        node.next.next = node;
        node.next = null;
        return newHead;
    }
    // Print linked list
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 1 → 2 → 3 → 4
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original: ");
        printList(head);

        head = reverse(head);

        System.out.print("Reversed: ");
        printList(head);
    }
}
