package tree;

public class TreeTraversal {
    public static void main(String[] args) {
        Node root;
        root = new Node(15);
        root.left = new Node(6);
        root.right = new Node(18);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(17);
        root.right.right = new Node(20);
        TreeTraversal traversal = new TreeTraversal();
        System.out.println("pre order starts");
        traversal.preOrderRecursive(root);
        System.out.println("in order starts");
        traversal.inOrderRecursive(root);
        System.out.println("search starts");
        System.out.println(traversal.search(root, 21));
    }

    private boolean search(Node root, int i) {
        if (root != null) {
            if (i > root.key) {
                return search(root.right, i);
            } else if (i < root.key) {
                return search(root.left, i);
            } else {
                return true;
            }
        }
        return false;

    }

    private void preOrderRecursive(Node root) {
        if (root != null) {
            System.out.println(root.key);
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    void inOrderRecursive(Node root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.println(root.key);
            inOrderRecursive(root.right);
        }
    }

}

class Node {
    Node left;
    Node right;
    int key;

    Node(int num) {
        this.key = num;
        this.left = null;
        this.right = null;
    }
}