package LinkedList_Implementation;

public class MiddleOfTheLinkedList_876 {

    // Inner class for a Node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to find the middle node
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        // Move 'fast' by 2 and 'slow' by 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow will be at the middle node
    }

    public static void main(String[] args) {
        // Create Linked List: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find middle
        Node middle = findMiddle(head);

        System.out.println("Middle node value: " + middle.data);
    }
}
