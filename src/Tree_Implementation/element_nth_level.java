package Tree_Implementation;

public class element_nth_level {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left= null;
            this.right= null;

        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);
        root.left.right.left= new Node(8);
        root.left.right.right=new Node(9);
        root.right.right.left= new Node(10);

        element_nth_level(root,0);

    }

    static int levels_at=2;


    private static void element_nth_level(Node main,int levels){

        if(main==null) return;
        if (levels== levels_at) System.out.print(main.data + " ");

        element_nth_level(main.left,levels+1);

        element_nth_level(main.right,levels+1);




    }









}
