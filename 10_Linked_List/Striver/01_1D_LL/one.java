public class one{

    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static void insertHead(Node head , int val){
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } 
        System.out.print("END");
    }

    public static void length(Node head){
        int count = 0 ; 
        while(head!=null){
            count++;
            head = head.next;
        }
        System.out.println(count);
    }

    public static void search(Node head , int key){
        while(head!=null){
            if(head.val == key){
                System.out.println("Found");
                return;
            }
            head = head.next;
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        insertHead(head, 06564);

        print(head);
        length(head);
        search(head, 2);
    }
}
