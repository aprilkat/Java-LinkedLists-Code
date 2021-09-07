
/*
*   Author: April Bollinger
*   Date: 3/8/2021
*   Program: Binary Tree
*   Purpose: To explore and learn how to implement Binary Trees
*/

public class BinaryTree {

    static TreeNode treeRoot;
    LinkedList printNodes;
    TreeNode left;
    TreeNode right;

    void addNode(Character Letter) {

        TreeNode treeRoot = new TreeNode(Letter);
        treeRoot = addBranch(treeRoot, Letter);
    }

    TreeNode addBranch(TreeNode treeRoot, Character Letter) {
        if (treeRoot == null) {
            treeRoot = new TreeNode(Letter);
            return treeRoot;
        }

        if (Letter < treeRoot.Letter) {
            treeRoot.left = addBranch(treeRoot.left, Letter);

        } else if (Letter > treeRoot.Letter) {
            treeRoot.right = addBranch(treeRoot.right, Letter);

        }

        return treeRoot;

    }

    public static void printingNodes(TreeNode treeRoot) {
        if (treeRoot == null) {
            return;
        }
        if (treeRoot.left == null && treeRoot.right == null) {
            System.out.println(treeRoot.Letter);
        }

        printingNodes(treeRoot.left);
        printingNodes(treeRoot.right);
    }

    public static void main(String[] args) {
        LinkedList tree = new LinkedList();
        tree.addNode('a', tree);
        tree.addNode('g', tree);
        tree.addNode('T', tree);
        tree.addNode('.', tree);
        printingNodes(treeRoot);
    }

}