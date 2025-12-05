package Tree_Implementation;

public class Inorder_traversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            this.right= null;
            this.left= null;

        }
    }


    static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        inorder(root);

    }

    private static void inorder(Node main){
        if(main==null) return;
        inorder(main.left);
        System.out.print(main.data);
        inorder(main.right);


    }










}
