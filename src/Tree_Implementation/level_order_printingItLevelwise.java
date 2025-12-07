package Tree_Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class level_order_printingItLevelwise {
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
    static public class Pairs {
        Node node;
        int levels;
        Pairs(Node node, int levels){
            this.node= node;
            this.levels= levels;

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
        root.left.right.left = new Node(8);
        root.right.right.left = new Node(9);




        System.out.println("level order Traversal");


        Level_Order_printingLevelWise(root);
    }



    static void Level_Order_printingLevelWise(Node main){
        Queue<Pairs> q = new LinkedList<>();
        int prelevel =0;

        if (main != null) q.add(new Pairs(main, 0));



        while(!q.isEmpty()){
            Pairs front = q.remove();
            int level= front.levels;
            if (prelevel != level){
                System.out.println();
                prelevel++;
            }
            System.out.print(front.node.data+" " );

            if(front.node.left!= null) q.add(new Pairs(front.node.left, level +1 ));

            if(front.node.right!=null) q.add(new Pairs(front.node.right,level +1 ));




        }


    }



















}
