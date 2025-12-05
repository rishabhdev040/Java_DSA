package Tree_Implementation;

public class preorder_traversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;

        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(7);
        root.right= new Node(9);
        root.left.left = new Node (2);
        root.left.right= new Node(6);
        root.right.right = new Node(9);
        root.left.right.left= new Node(5);
        root.left.right.right= new Node(11);
        root.right.right.left= new Node(5);
        preorder(root);

    }
    private static void preorder(Node main){
        if (main== null) return;
        System.out.print(main.data+ " ");
        preorder(main.left);
        preorder(main.right);

    }










}
