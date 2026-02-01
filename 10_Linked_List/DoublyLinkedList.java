public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public DoublyLinkedList() {
        this.size = 0;
    }

    // Node class
    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    public void addAtStart(int value) {
        Node node = new Node(value);
    
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }
    
    public void addAtEnd(int value){
        Node node = new Node(value);
        if(tail==null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail=node;
        }
        size++;
    }

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
    
        size++; // ✅ ONLY here
    }
    
    public void deleteAtStart() {
        if (head == null) {
            return;
        }
    
        if (head == tail) { // only one node
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    

    public void deleteAtEnd() {
        if (tail == null) {
            return;
        }
    
        if (head == tail) { // only one node
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    

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
    

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
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
        list.deleteAtIndex(2);
        list.display();
    }
}