
public class BinaryTree2{

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(){
                this.val = 0;
                this.left = null;
                this.right = null;
        }
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;

    
    public static void main(String[] args) {
        Node root = new Node(1);
        
    }
}