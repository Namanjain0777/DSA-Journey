// Implement class Node

public class BinaryTree{
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
    // TC O(N) || SC O(h) where h is the height of the tree
    // Worst case (skewed tree) → O(n)
    // Best case (balanced tree) → O(log n)
    public static void displayPreOrder(Node root){   //it will display the tree in pre-order traversal
        if(root == null){
            return;
        }
        System.out.print(root.val + " -> ");
        if(root.left != null){
           System.out.print(root.left.val + " , " );
        }if(root.right != null){
            System.out.print(root.right.val);
        }else{
            System.out.print("n , n");
        }
        System.out.println();
        displayPreOrder(root.left);
        displayPreOrder(root.right);
    }
    
    // TC O(N) || SC O(h) where h is the height of the tree
    public static int size(Node root){   //it will return the size of the tree || no of nodes in the tree
        if(root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    // TC O(N) || SC O(h) where h is the height of the tree
    public static int height(Node root){
        if(root == null){
            return -1;
        }
        return 1+ Math.max(height(root.left), height(root.right));
    }

    // TC O(N) || SC O(h) where h is the height of the tree
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    // TC O(N) || SC O(h) where h is the height of the tree
    public static int maxValue(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(maxValue(root.left), maxValue(root.right)));
    }

    // TC O(N) || SC O(h) where h is the height of the tree
    public static int minValue(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val,Math.min(minValue(root.left), minValue(root.right)));
    }
    
    
    // level = log n {n is the number of nodes in the tree} || O(n) in case of skewed tree
    public static int levels(Node root){
        if(root == null){
            return 0;     }
        return 1 + Math.max(height(root.left), height(root.right))  ;
    }

    // Preorder Treversal : Root -> Left -> Right
    // TC O(N) || SC O(h) where h is the height of the tree
    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.val + " -> ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Inorder Traversal : Left -> Root -> Right
    // TC O(N) || SC O(h) where h is the height of the tree
    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.val + " -> ");
        inOrder(root.right);
    }

    // Postorder Traversal : Left -> Right -> Root
    // TC O(N) || SC O(h) where h is the height of the tree
    public static void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);  
         System.out.print(root.val + " -> ");
    }
    

    public static void nthlevelOrder(Node root , int n){  //TC : O(n) || O(N^2)[skewed tree] || SC : O(n)
        if(root == null){
            return;
        }
        if(n==1){
        System.out.print( root.val + " ");
        }
        nthlevelOrder(root.left , n-1);
        nthlevelOrder(root.right , n-1);
    }

    public static void main(String[] args) {
        Node root = new Node();
        root.val = 1;
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);
        displayPreOrder(root);
        System.out.println("Size of the tree is : " + size(root));
        System.out.println("Height of the tree is : " + height(root));
        System.out.println("Sum of the tree is : " + sum(root));
        System.out.println("Max value in the tree is : " + maxValue(root));
        System.out.println("Min value in the tree is : " + minValue(root));
        System.out.println("Levels in the tree is : " + levels(root));
        System.out.println("Preorder Traversal : ");
        preOrder(root);
        System.out.println("\nInorder Traversal : ");
        inOrder(root);
        System.out.println("\nPostorder Traversal : ");
        postOrder(root);
        System.out.println("\nNth level order traversal : ");
        for(int i=1; i<=levels(root); i++){
            nthlevelOrder(root, i);
            System.out.println();
        }
    }
}
