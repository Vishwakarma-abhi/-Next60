import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveLoop {
    private static boolean findLoop(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    private static Node findAndRemoveLoop(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // Found the loop, now find the starting point
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                // Returning the starting point of the loop
                return fast;
            }
        }
        return null; // No loop found
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head; // Creating a loop

        // Using Floyd's Algorithm to find and remove the loop
        System.out.println("Using Floyd's Algorithm");
        Node loopStart = findAndRemoveLoop(head);
        System.out.println("Starting point of the loop is " + (loopStart != null ? loopStart.data : "No loop"));
    }
}
