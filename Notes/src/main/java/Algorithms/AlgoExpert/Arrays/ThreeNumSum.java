package Algorithms.AlgoExpert.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreeNumSum {

  public static int[] threeNumSumWithTwoPointers(int[] numbers, int target) {

    int currentSum;
    int[] answer = new int[3];

    for (int i = 0; i < numbers.length - 2; i++) {
      int leftP = i + 1;
      int rightP = numbers.length - 1;

      while (leftP < rightP) {
        currentSum = numbers[i] + numbers[leftP] + numbers[rightP];

        if (currentSum == target) {
          answer[0] = i;
          answer[1] = leftP;
          answer[2] = rightP;
          return answer;
        }
        else if (currentSum < target) leftP++;
        else if (currentSum > target) rightP--;
      }

    }
    return answer;
  }


  public static int[] threeNumSumWithHashMap(int[] numbers, int target) {
    int[] answer = new int[3];
    HashMap<Integer, Integer> numbersMap = new HashMap<>();

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        int valueNeeded = target - numbers[i] - numbers[j];

        if (numbersMap.containsKey(valueNeeded)) {
          answer[0] = numbersMap.get(valueNeeded);
          answer[1] = i;
          answer[2] = j;
          return answer;
        } else {
          numbersMap.put(numbers[i], i);
          numbersMap.put(numbers[j], j);
        }
      }
    }
    return answer;
  }

  public static int[] threeNumSumBruteForce(int[] numbers, int target) {
    int[] answer = new int[3];
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        for (int k = j + 1; k < numbers.length; k++) {
          if (numbers[i] + numbers[j] + numbers[k] == target) {
            answer[0] = i;
            answer[1] = j;
            answer[2] = k;
            return answer;
          }
        }
      }
    }
  return answer;
  }


}
