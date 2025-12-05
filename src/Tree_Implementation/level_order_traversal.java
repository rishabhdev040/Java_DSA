package Tree_Implementation;

import java.util.LinkedList;
import java.util.Queue;
// this is also known as BFS(breadth first search)
public class level_order_traversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data= data;
            this.left= null;
            this.right= null;

        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.right = new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        System.out.println("level order Traversal");

        Level_Order(root);


    }

    private static void Level_Order (Node main){

        Queue<Node> q = new LinkedList<>();
        if (main!= null) q.add(main);
        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.data);
            if(front.left!= null) q.add(front.left);
            if(front.right!=null)  q.add(front.right);

        }



    }










}
