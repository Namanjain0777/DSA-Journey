
public class one {
    public static class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val){
            this.val = val;
            this.prev = null;
            this.next = null;
        }
        public Node( ){
            this.val = val;
            this.prev = prev;
            this.next = null;
        }       
    }

    public static Node insertHead(Node head , int val){
        Node newHead = new Node(val);
        newHead.next = head;
        if(head != null){
            head.prev = newHead;
        }
        return newHead;
    }


   public static Node deleteHead(Node head){
        if(head == null) return null;
        head = head.next;
        if(head != null){
            head.prev = null;
        }
        return head;
    }

    public static void reverse(Node head){
        Node temp = null;
        Node current = head;

        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if(temp != null){
            head = temp.prev;
        }
    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


      public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head = insertHead(head, 10);
        print(head);
        head = deleteHead(head);
        print(head);
        reverse(head);
        print(head);
    }
}
// Done
