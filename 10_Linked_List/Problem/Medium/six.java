
public class six {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    } 
    static Node head;
    
    static Boolean hasLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(8);

        // create loop;
        head.next.next.next = head.next;
        boolean isLoop = hasLoop(head);
        System.out.println(isLoop);
    }    
}
