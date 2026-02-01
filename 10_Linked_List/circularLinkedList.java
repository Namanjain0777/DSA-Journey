public class circularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public circularLinkedList() {
        this.size = 0;
    }

    // Node class
    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    // Add at start
    public void addAtStart(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            node.prev = node;
        } else {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        }
        size++;
    }

    // Add at end
    public void addAtEnd(int value) {
        if (head == null) {
            addAtStart(value);
            return;
        }

        Node node = new Node(value);
        node.prev = tail;
        node.next = head;
        tail.next = node;
        head.prev = node;
        tail = node;
        size++;
    }

    // Add at index
    public void addAtIndex(int index, int value) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Invalid index");
        }

        if (index == 0) {
            addAtStart(value);
            return;
        }

        if (index == size) {
            addAtEnd(value);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(value);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
        size++;
    }

    // Delete at start
    public void deleteAtStart() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        size--;
    }

    // Delete at end
    public void deleteAtEnd() {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        size--;
    }

    // Delete at index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Invalid index");
        }

        if (index == 0) {
            deleteAtStart();
            return;
        }

        if (index == size - 1) {
            deleteAtEnd();
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node toDelete = temp.next;
        temp.next = toDelete.next;
        toDelete.next.prev = temp;
        size--;
    }

    // Reverse (CORRECT for circular doubly linked list)
    public void reverse() {
        if (head == null || head == tail) {
            return;
        }

        Node curr = head;
        do {
            Node temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            curr = temp;
        } while (curr != head);

        Node temp = head;
        head = tail;
        tail = temp;
    }

    // Display
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        list.addAtStart(10);
        list.addAtStart(20);
        list.addAtStart(30);
        list.addAtEnd(40);
        list.addAtEnd(50);
        list.addAtIndex(2, 100);
        list.display();

        list.deleteAtStart();
        list.display();

        list.deleteAtEnd();
        list.display();

        list.reverse();
        list.display();
    }
}
