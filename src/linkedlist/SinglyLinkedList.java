package linkedlist;

public class SinglyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(10);
        list.deleteNodeHavingData(60);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        //list.insertAtBeginning(40);
        list.deleteNodeHavingData(40);
        list.insertAtEnd(40);
        //list.insertAtBeginning(60);
        list.insertAtEnd(60);
        list.insertAtEnd(60);

        list.deleteNodeHavingData(20);
        list.deleteNodeHavingData(60);
        System.out.println("after del");
        list.printList();
    }

    private void deleteNodeHavingData(int i) {

        if (head != null && head.data == i) {
            head = head.next;
        }
        Node current = head;
        Node previous = head;
        while (current != null) {
            if (current.data == i) {
                previous.next = current.next;
                current = current.next;
            } else {
                previous = current;
                current = current.next;
            }
        }
    }

    private void insertAtBeginning(int i) {
        Node node = new Node(i);
        node.next = head;
        head = node;
    }

    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private void insertAtEnd(int i) {
        if (head == null) {
            Node firstNode = new Node(i);
            firstNode.next = null;
            head = firstNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node node = new Node(i);
            temp.next = node;
        }
    }

}
