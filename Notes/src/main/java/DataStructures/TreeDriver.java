package DataStructures;

public class TreeDriver {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.createNewNode("Root");
        root.left = tree.createNewNode("Level 2 left child");
        root.right = tree.createNewNode("Level 2 right child");
        root.left.left = tree.createNewNode("Level 3 left childs left child");
        root.left.right = tree.createNewNode("Level 3 left childs right child");
        root.right.left = tree.createNewNode("Level 3 right childs left child");
        root.right.right = tree.createNewNode("Level 3 right childs right child");
        root.left.left.left = tree.createNewNode("Level 4 left childs left childs left child");
        root.left.left.right = tree.createNewNode("Level 4 left childs left childs right child");
        root.left.right.left = tree.createNewNode("Level 4 left childs right childs left child");
        root.left.right.right = tree.createNewNode("Level 4 left childs right childs right child");
        root.right.left.left = tree.createNewNode("Level 4 right childs left childs left child");
        root.right.left.right = tree.createNewNode("Level 4 right childs left childs right child");
        root.right.right.left = tree.createNewNode("Level 4 right childs right childs left child");
        root.right.right.right = tree.createNewNode("Level 4 right childs right childs right child");

        //tree.inOrderTraversal(root);
        //tree.preOrderTraversal(root);
        tree.postOrderTraversal(root);
    }

}
