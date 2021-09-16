package Algorithms.AlgoExpert.Arrays;

import java.util.HashMap;

public class TwoNumSum {

  // To binary search for the two num sum, array must be sorted
  public static int[] twoNumSumWithTwoPointers(int[] numbers, int sum) {
    int[] answer = new int[2];
    answer[0] = -1;
    answer[1] = -1;
    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {
      if (numbers[left] + numbers[right] == sum) {
        answer[0] = left;
        answer[1] = right;
        return answer;
      }
      if (sum < numbers[left] + numbers[right]) right--;
      else left++;
    }
    return answer;
  }

  public static int[] twoNumSumWithHashMap(int[] numbers, int sum) {
    int[] answer = new int[2];
    answer[0] = -1;
    answer[1] = -1;
    //  Map  <Value, Index>
    HashMap<Integer, Integer> numbersMap = new HashMap<>();

    for (int i = 0; i < numbers.length; i++) {
      int valueNeeded = sum - numbers[i];

      if (numbersMap.containsKey(valueNeeded)) {
        answer[0] = i;
        answer[1] = numbersMap.get(valueNeeded);
        return answer;
      } else {
        numbersMap.put(numbers[i], i);
      }
    }
    return answer;
  }

  public static int[] twoNumSumBruteForce(int[] numbers, int sum) {
    int[] answer = new int[2];
    answer[0] = -1;
    answer[1] = -1;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == sum) {
          answer[0] = i;
          answer[1] = j;
          return answer;
        }
      }
    }
    return answer;
  }
}
