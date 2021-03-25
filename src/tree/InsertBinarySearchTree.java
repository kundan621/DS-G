package tree;

public class InsertBinarySearchTree {
    Node root = null;

    public static void main(String[] args) {

        InsertBinarySearchTree bst = new InsertBinarySearchTree();
        bst.insert(10);
        bst.insert(-5);
        bst.insert(15);
        bst.insert(50);
        bst.insert(6);
        bst.inOrderRecursive();
    }

    private void insert(int num) {
        if (root == null) {
            root = new Node(num);
        } else {
            Node temp = root;
            while (temp.left != null && temp.right != null) {
                if (num >= temp.key) {
                    temp = temp.right;
                } else {
                    temp = temp.left;
                }
            }
            if (num > temp.key) {
                temp.right = new Node(num);
            } else {
                temp.left = new Node(num);
            }
        }
    }

    void inOrderRecursive() {
        traverse(root);
    }

    void traverse(Node root) {
        if (root != null) {
            traverse(root.left);
            System.out.println(root.key);
            traverse(root.right);
        }
    }


}