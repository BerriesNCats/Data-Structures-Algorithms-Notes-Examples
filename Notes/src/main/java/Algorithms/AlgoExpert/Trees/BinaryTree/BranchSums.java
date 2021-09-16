package Algorithms.AlgoExpert.Trees.BinaryTree;

import Algorithms.AlgoExpert.Trees.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BranchSums {

  List<Integer> sums = new ArrayList<>();

  public void branchSums(TreeNode root) {
    calculateBranchSums(root, 0);
  }

  public void calculateBranchSums(TreeNode root, int runningSum) {
    int newRunningSum = runningSum + root.getVal();

    // Base Case
    if (root == null) return;

    // If leaf node, add sum to sums list
    if (root.getLeftNode() == null && root.getRightNode() == null) {
      sums.add(newRunningSum);
      return;
    }

    // Recursive Case
    calculateBranchSums(root.getLeftNode(), newRunningSum);
    calculateBranchSums(root.getRightNode(), newRunningSum);
  }
}
