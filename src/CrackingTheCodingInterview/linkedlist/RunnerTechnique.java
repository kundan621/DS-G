package CrackingTheCodingInterview.linkedlist;

public class RunnerTechnique {
    public static void main(String[] args) {
        RemoveDuplicates.Node head = new RemoveDuplicates.Node(20);
        head.nextNode = new RemoveDuplicates.Node(20);
        head.nextNode.nextNode = new RemoveDuplicates.Node(20);
        head.nextNode.nextNode.nextNode = new RemoveDuplicates.Node(100);
        head.nextNode.nextNode.nextNode.nextNode = new RemoveDuplicates.Node(100);
        head.nextNode.nextNode.nextNode.nextNode.nextNode = new RemoveDuplicates.Node(100);

        RemoveDuplicates.Node temp = head;
        while (temp != null) {
            RemoveDuplicates.Node runner = temp;
            RemoveDuplicates.Node prev = null;
            while (runner != null && runner.data != 100) {
                prev = runner;
                runner = runner.nextNode;
            }
            if (prev != null && runner.data == 100) {
                prev.nextNode = runner.nextNode;
                runner.nextNode = temp.nextNode;
                temp.nextNode = runner;
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
