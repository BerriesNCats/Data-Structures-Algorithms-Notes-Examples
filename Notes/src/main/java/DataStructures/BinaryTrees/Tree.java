package DataStructures.BinaryTrees;

public class Tree {

    private TNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TNode(value);
        } else {
            root.insert(value);
        }
    }

}
