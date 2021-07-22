package Algorithms.LeetCode;

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

        System.out.print(solution[0] + ", " + solution[1]);
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

}
