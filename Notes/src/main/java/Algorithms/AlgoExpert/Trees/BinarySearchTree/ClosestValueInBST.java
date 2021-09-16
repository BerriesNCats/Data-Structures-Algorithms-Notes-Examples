package Algorithms.AlgoExpert.Trees.BinarySearchTree;

import Algorithms.AlgoExpert.Trees.TreeNode;

public class ClosestValueInBST {

  // root = [4, 2, 5, 1, 3] target = 3.71

  // root - >   10
  //        5       15
  //      2  5    13  22
  //     1       14

  public int closestValue(TreeNode root, double target) {
    return findClosestValue(root, target, Double.MAX_VALUE, root.getVal());
  }

  private int findClosestValue(
      TreeNode root, double target, double difference, int currentClosest) {

    // Base Case
    if (root == null) {
      return currentClosest;
    }

    // If the difference between the current node and the target is smaller than any difference
    // we have found yet, update the difference and track which node value is the closest
    if (Math.abs(target - root.getVal()) < difference) {
      difference = Math.abs(target - root.getVal());
      currentClosest = root.getVal();
    }

    // Recursive Case
    // If the the number being targeted is greater than the current node, explore right
    if (target > root.getVal()) {
      return findClosestValue(root.getRightNode(), target, difference, currentClosest);
    } else { // if the number being targeted is less than the current node, explore left
      return findClosestValue(root.getLeftNode(), target, difference, currentClosest);
    }
  }
}
