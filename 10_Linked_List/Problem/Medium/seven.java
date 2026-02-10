
public class seven {
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static int findLoopLength(Node head) {

        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Loop detected
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }

        // No loop
        return 0;
    }

    // Step 2: Count loop length
    static int countLoopLength(Node meetingPoint) {
        int count = 1;
        Node temp = meetingPoint.next;

        while (temp != meetingPoint) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        // Create linked list
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create loop: 5 → 3
        head.next.next.next.next.next = head.next.next;

        int loopLength = findLoopLength(head);
        System.out.println("Length of loop: " + loopLength);
    }
}
