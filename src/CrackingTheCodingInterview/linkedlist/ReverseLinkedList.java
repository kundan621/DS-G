package CrackingTheCodingInterview.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        DeleteAGivenNodeWithoutHeadAccess.Node head = new DeleteAGivenNodeWithoutHeadAccess.Node(10);
        head.next = new DeleteAGivenNodeWithoutHeadAccess.Node(20);
        head.next.next = new DeleteAGivenNodeWithoutHeadAccess.Node(30);
        head.next.next.next = new DeleteAGivenNodeWithoutHeadAccess.Node(40);
        head.next.next.next.next = new DeleteAGivenNodeWithoutHeadAccess.Node(50);
        head = reverseLinkedList(head);
        DeleteAGivenNodeWithoutHeadAccess.Node temp3 = head;
        while (temp3 != null) {
            System.out.println(temp3.data);
            temp3 = temp3.next;
        }
    }

    private static DeleteAGivenNodeWithoutHeadAccess.Node reverseLinkedList(DeleteAGivenNodeWithoutHeadAccess.Node head) {
        DeleteAGivenNodeWithoutHeadAccess.Node current = head;
        DeleteAGivenNodeWithoutHeadAccess.Node prev = null;
        DeleteAGivenNodeWithoutHeadAccess.Node next = head.next;
        while (next != null) {
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        current.next = prev;
        return current;

    }
}
