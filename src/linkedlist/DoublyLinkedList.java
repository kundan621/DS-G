package linkedlist;

public class DoublyLinkedList {
    Node head;

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(11);
        list.insertAtEnd(12);
        list.insertAtBeginning(15);
        list.printData();
    }

    private void insertAtBeginning(int num) {
        Node node = new Node(num);
        if (head == null) {
            head = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
    }

    private void printData() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private void insertAtEnd(int num) {
        Node node = new Node(num);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            node.prev = temp;
            temp.next = node;
        }

    }


}

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}