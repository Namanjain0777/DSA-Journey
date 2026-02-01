// its for singly linked list
public class singlyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public singlyLinkedList() {
        this.size = 0;
    }

    // Node class
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addAtStart(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size++;
    }

    public void addAtEnd(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addAtIndex(int index ,int value){
        if (index == 0) {
            addAtStart(value);
        } else if (index == size) {
            addAtEnd(value);
        } else {
            if (index < 0 || index > size) {
                throw new IllegalArgumentException("Invalid index");
            }
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node node = new Node(value);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void deleteAtStart() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    
        if (head == null) {
            tail = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null || size == 1) {
            deleteAtStart();
            return;
        }
    
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
    
        temp.next = null;
        tail = temp;
        size--;
    }
    

    
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
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
    
        temp.next = temp.next.next;
        size--;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        tail = head; // old head becomes new tail
    
        while (curr != null) {
            Node next = curr.next; // store next
            curr.next = prev;      // reverse link
            prev = curr;           // move prev
            curr = next;           // move curr
        }
    
        head = prev; // new head
    }
    // Display LinkedList
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtStart(5);
        list.addAtStart(1);
        list.addAtIndex(2, 15);
        list.display();
        // list.deleteAtStart();
        // list.display();
        // list.deleteAtEnd();
        // list.display();
        // list.deleteAtIndex(1);
        // list.display();   // 10 -> 20 -> 30 -> END
        System.out.println("Size: " + list.size());
        list.reverse();
        list.display();
    }
}
