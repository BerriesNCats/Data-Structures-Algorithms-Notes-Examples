/*
 * Copyright David Amateau 2021.
 */

package Algorithms.AlgoExpert.Trees;

public class TreeNode {

  int val;
  TreeNode leftNode;
  TreeNode rightNode;

  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode leftNode, TreeNode rightNode) {
    this.val = val;
    this.leftNode = leftNode;
    this.rightNode = rightNode;
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }

  public TreeNode getLeftNode() {
    return leftNode;
  }

  public void setLeftNode(TreeNode leftNode) {
    this.leftNode = leftNode;
  }

  public TreeNode getRightNode() {
    return rightNode;
  }

  public void setRightNode(TreeNode rightNode) {
    this.rightNode = rightNode;
  }
}
