package Algorithms.LeetCode;

import java.util.HashMap;

/**
 * LeetCode #0001
 *
 * Given an array of integers 'numbers' and an integer 'target', return indices of the two numbers such that they add up
 * to target. You may assume that each input would have exactly one solution, and you may not use the same element
 * twice. You can return the answer in any order.
 *
 * Example Input
 *      numbers = [2, 7, 11, 13, 15], target = 13
 *          2 + 11 = target
 *
 *      Output = [0, 2]
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 13, 15};
        int[] solution = twoSum(numbers, 13);
        int[] hashMapSolution = twoSumWithHashMap(numbers, 9);

        System.out.println(solution[0] + ", " + solution[1]);
        System.out.println(hashMapSolution[0] + ", " + hashMapSolution[1]);

    }

    public static int[] twoSum(int[] numbers, int target) {

        // i is our left index pointer
        for (int i = 0; i < numbers.length; i++) {

            // j is our right index pointer
            for (int j = 1; j < numbers.length; j++) {
                // if i + j equals our solution && i is not equal to j
                if (numbers[i] + numbers[j] == target && i != j) return new int[]{i, j};
            }
        }
        return null;
    }

    public static int[] twoSumWithHashMap(int[] numbers, int target) {
        int[] solution = new int[2];
        HashMap<Integer, Integer> numbersHashMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            // if the hashmap contains the value already which combined with the number at the current
            // index equals the solution then we have found the solution
            if (numbersHashMap.containsKey(target - numbers[i])) {
                // get the number from the hashmap that contains the key which is the solution and set
                // its index as the first half of the answer with the value at i as the second half
                solution[0] = numbersHashMap.get(target - numbers[i]);
                solution[1] = i;

                return solution;
            }

            // put into the hashmap the value of the number at i with i as its key
            numbersHashMap.put(numbers[i], i);
        }
        return null;
    }

}
