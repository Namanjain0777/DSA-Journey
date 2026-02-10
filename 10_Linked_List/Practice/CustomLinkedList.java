public class CustomLinkedList {

    // Node structure
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node head;
    Node tail;
    int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    // Insert at beginning
    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at end
    public void insertLast(int data) {
        if (tail == null) {
            insertFirst(data);
            return;
        }

        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Insert at index
    public void insert(int index, int data) {

        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertFirst(data);
            return;
        }

        if (index == size) {
            insertLast(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }


   public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }


    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insert(1, 15);
        list.display(); // 10 -> 15 -> 20 -> 30 -> END
        // list.deleteFirst();
        // list.deleteLast();
        list.delete(2);
        list.display(); // 10 -> 15 -> 20 -> 30 -> END
    }
}
