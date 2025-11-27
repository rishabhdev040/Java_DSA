package LinkedList_Implementation;

public class Delete_Node_in_LL_237_Leetcode {

    static class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data ;
            this.next = null;

        }

    }

    public static void main (String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        //suppose you have delete the node containing the data value of 5
        //so you need to pass the node in the remove node function with the exact node you want to delete

        Node remove_it = head.next.next.next.next;

        // calling the function which does the operation of removing the Node given to it
        // in this case we are deleting the Node Stored in the remove_it (Node )
        removing_given_Node(remove_it);
        //The Node is removed from the complete Singly Linked List
        // Now the Linked List does not contain the Node passed as remove_it Node





    }
    // Defining the Logic to remove the passed Node in the below defined function Named as removing_given_Node
    static void removing_given_Node(Node node){
        node.data = node.next.data;
        node.next = node.next.next;

    }

}
