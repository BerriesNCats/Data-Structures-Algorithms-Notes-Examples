package Algorithms.LeetCode;

/*
A for loop to cycle through the numbers in the array
Another for loop to compare other indices with
Check to make sure that i and j are not the same index
*/


class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (i != j && numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}