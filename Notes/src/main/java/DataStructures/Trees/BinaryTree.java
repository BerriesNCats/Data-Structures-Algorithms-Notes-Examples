package DataStructures.Trees;

/**
    FileName: DataStructures.Trees.BinaryTree.java
    A binary tree is a tree where each node has 0, 1 or 2 children.
 */

public class BinaryTree {

    public TreeNode createNewNode (String data) {
        TreeNode a = new TreeNode(data);
        a.left = null;
        a.right = null;
        return a;

    }

    // This tree traversal will print all the left children before exploring
    // and printing right children
    public void inOrderTraversal(TreeNode node) {
        if (node == null) return;

        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);

    }

    // This tree traversal will print its starting node and then all its left child
    // who will print itself and then print its left child, etc
    public void preOrderTraversal(TreeNode node) {
        if (node == null) return;

        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // This tree traversal will explore until it reaches the maximum depth of the
    // tree before printing its bottom level and returning up
    public void postOrderTraversal(TreeNode node) {
        if (node == null) return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }

}
