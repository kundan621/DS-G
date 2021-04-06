package CrackingTheCodingInterview.linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {
    static class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        head.nextNode = new Node(30);
        head.nextNode.nextNode = new Node(40);
        head.nextNode.nextNode.nextNode = new Node(60);
        head.nextNode.nextNode.nextNode.nextNode = new Node(60);
        head.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(60);

        Node temp = head;
        //iteration
       /* while(temp!=null){
            System.out.println(temp.data);
            temp=temp.nextNode;
        }*/
        //deletion of duplicates
        HashSet<Integer> set = new HashSet<>();
        Node prev = head;
        while (temp != null) {
            if (set.contains(Integer.valueOf(temp.data))) {
                prev.nextNode = temp.nextNode;
            } else {
                set.add(Integer.valueOf(temp.data));
                prev = temp;
            }

            temp = temp.nextNode;
        }

        System.out.println("after removal");
        Node temp2 = head;
        //iteration
        while (temp2 != null) {
            System.out.println(temp2.data);
            temp2 = temp2.nextNode;
        }
    }
}
