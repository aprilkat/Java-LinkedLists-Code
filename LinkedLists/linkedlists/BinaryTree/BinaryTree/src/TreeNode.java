
/*
 * Author: April Bollinger
 * Date: 3/8/2021 
 * Program: Binary Tree
 * This file is to be used with the BinaryTree.java file
 */

public class TreeNode {

    // Seting up the data and the child nodes
    Character Letter;
    TreeNode left;
    TreeNode right;

    TreeNode(Character Letter) {
        Letter = '\0';
        left = null;
        right = null;

    }

    public void contruct(TreeNode Left, TreeNode right, Character Letter){
        this.right = right;
        this.left = left;
        this.Letter = Letter;
    }
}
