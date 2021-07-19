package Algorithms;

public class FindPairThatSumsUpTo {

    /*
     * Given an array of integers and integer a number, create a boolean function that checks if there exists in the
     * array two integers whose sum equals the number passed in.
     */

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 11, 3, 6};

        System.out.println(isTherePairThatEquals(numbers, 10));

        int[] sortedNumbers = {1, 3, 6, 8, 9, 11, 14, 16, 17, 24, 35};

        System.out.println(isTherePairInSortedArray(sortedNumbers, 15));
    }

    // Brute Force Solution
    public static boolean isTherePairThatEquals(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int currentPair = numbers[i] + numbers[j];
                if (i != j && currentPair == number) {
                    return true;
                }
            }
        }
        return false;
    }

    // No nested loops if array is sorted Solution
    public static boolean isTherePairInSortedArray(int[] numbers, int number) {
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        // If the sum is greater than number decrease the right pointer
        // If the sum is less than number increase the left pointers=
        while (leftIndex < rightIndex) {
            if (numbers[leftIndex] + numbers[rightIndex] == number) return true;
            else if (numbers[leftIndex] + numbers[rightIndex] < number) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return false;
    }
}
