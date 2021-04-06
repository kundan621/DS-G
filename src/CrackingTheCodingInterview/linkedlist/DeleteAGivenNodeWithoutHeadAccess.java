package CrackingTheCodingInterview.linkedlist;

public class DeleteAGivenNodeWithoutHeadAccess {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        //30
        delete(head.next.next.next);

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static void delete(Node node) {
        if (node == null || node.next == null)
            return;
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
