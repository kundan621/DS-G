package CrackingTheCodingInterview.linkedlist;

public class PrintFromLastTOK {
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
        /*head.next.next = new Node(40);*/
        /*head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(60);*/
        printKthElementFromLastRecursive(head, 2);
        printKthElementFromLastIterative(head, 2);
    }

    private static void printKthElementFromLastIterative(Node head, int k) {
        Node frontRunner = head;
        Node backRunner = head;
        for (int i = 0; i < k; i++) {
            frontRunner = frontRunner.next;
        }
        while (frontRunner != null) {
            backRunner = backRunner.next;
            frontRunner = frontRunner.next;
        }
        System.out.println(backRunner.data);
    }

    // static int index=0;
    private static int printKthElementFromLastRecursive(Node head, int k) {
        if (head == null)
            return 0;
        int index = printKthElementFromLastRecursive(head.next, k) + 1;
        if (index == k)
            System.out.println(head.data);
        return index;

    }
}
