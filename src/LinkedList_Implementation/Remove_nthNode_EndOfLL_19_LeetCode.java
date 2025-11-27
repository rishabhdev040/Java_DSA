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

    }
}
