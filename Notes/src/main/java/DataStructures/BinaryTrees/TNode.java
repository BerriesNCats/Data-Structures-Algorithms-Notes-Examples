package DataStructures.BinaryTrees;

public class TNode {

    private int data;
    private TNode leftChild;
    private TNode rightChild;

    public TNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        // This disallows duplicate values
        if (value == data) return;
        // If there is an empty space insert otherwise if its less than explore the left
        // If it is greater, explore the right
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TNode leftChild) {
        this.leftChild = leftChild;
    }

    public TNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TNode rightChild) {
        this.rightChild = rightChild;
    }
}
