package CrackingTheCodingInterview.linkedlist;

public class RemoveDuplicatesUsingRunnerTechnique {
    public static void main(String[] args) {
        RemoveDuplicates.Node head = new RemoveDuplicates.Node(20);
        head.nextNode = new RemoveDuplicates.Node(30);
        head.nextNode.nextNode = new RemoveDuplicates.Node(40);
        head.nextNode.nextNode.nextNode = new RemoveDuplicates.Node(60);
        head.nextNode.nextNode.nextNode.nextNode = new RemoveDuplicates.Node(60);
        head.nextNode.nextNode.nextNode.nextNode.nextNode = new RemoveDuplicates.Node(60);

        RemoveDuplicates.Node temp = head;
        while (temp != null) {
            RemoveDuplicates.Node current = temp;
            while (current.nextNode != null) {
                if (current.nextNode.data == current.data) {
                    current.nextNode = current.nextNode.nextNode;
                } else {
                    current = current.nextNode;
                }
            }
            temp = temp.nextNode;
        }

        RemoveDuplicates.Node temp3 = head;
        while (temp3 != null) {
            System.out.println(temp3.data);
            temp3 = temp3.nextNode;
        }
    }
}
