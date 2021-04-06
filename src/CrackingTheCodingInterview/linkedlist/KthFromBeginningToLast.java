package CrackingTheCodingInterview.linkedlist;

public class KthFromBeginningToLast {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(60);
        Node start = printFromKthToLast(3, head);
        while (start != null) {
            System.out.println(start.data);
            start = start.next;
        }
    }

    private static Node printFromKthToLast(int k, Node head) {
        Node temp = head;
        int position = 0;
        while (temp != null) {
            position++;
            if (position == k) {
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
}
