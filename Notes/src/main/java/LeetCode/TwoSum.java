package LeetCode;

/*
A for loop to cycle through the numbers in the array
Another for loop to compare other indices with
Check to make sure that i and j are not the same index
*/


class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    int[] answer = {i, j};
                    return answer;
                }
            }
        }

        return null;
    }
}