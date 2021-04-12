package CrackingTheCodingInterview.linkedlist;

//find sum of two numbers. Numbers are stored in such a way that last element is the first element.
public class SumOfTwoNumbers {
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        //617+295
        Node head = new Node(7);
        head.next = new Node(1);
        head.next.next = new Node(6);

        Node head2 = new Node(5);
        head2.next = new Node(9);
        head2.next.next = new Node(2);

        findSum(head, head2);


    }

    private static int findSum(Node head, Node head2) {
        if (head.next == null || head2.next == null) {
            return head.data;
        }

        int num1 = findSum(head.next, head2.next);
        int num2 = findSum(head.next, head2.next);
        int sum = num1 + num2;
        return sum;
    }
}
