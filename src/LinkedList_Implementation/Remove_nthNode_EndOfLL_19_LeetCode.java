package LinkedList_Implementation;

public class Remove_nthNode_EndOfLL_19_LeetCode {
    static class Node {
        int val;
        Node next;

        Node(int val){
            this.val =val;
            this.next = null;

        }

    }

    static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node (6);

        // Suppose we have to delete the node 3rd
        // we need to remember that the question is asking to delete the node from the tail of the singly linked list
        //setting Target Node as the question says us to do
        int Target = 3;

       Remove(head,Target);

        System.out.println(head.next.next.next.next.val);


    }
    static void Remove (Node operation, int target){
        // Approach called as Slow and Fast
        Node slow = operation;

        Node fast = operation;


        while(target>=0){
            fast=fast.next;
            target--;

        }
        while((fast!=null) && (fast.next!=null)){
            slow=slow.next;
            fast=fast.next;



        }
        slow.next=slow.next.next;

    }
}
