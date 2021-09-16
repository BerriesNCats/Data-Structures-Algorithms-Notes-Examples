package Algorithms.Searching;

public class BinarySearch {


  public static int binarySearch(int[] numbers, int target) {
    int leftP = 0;
    int rightP = numbers.length - 1;
    int middleP = 0;

    while (leftP < rightP) {
      middleP = leftP + (rightP - leftP) / 2;
      if (numbers[middleP] == target) return middleP;
      if (target < numbers[middleP]) {
        rightP = middleP - 1;
      } else {
        leftP = middleP + 1;
      }
    }
    return -1;
  }


}
