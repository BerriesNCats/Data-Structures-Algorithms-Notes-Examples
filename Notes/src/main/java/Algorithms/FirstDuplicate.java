package Algorithms;

import java.util.HashMap;
import java.util.HashSet;

public class FirstDuplicate {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 3, 2, 3, 5, 3, 2};

        System.out.println(firstDuplicateInIntArrayBruteForce(numbers));
        System.out.println(firstDuplicateInIntArrayWithHashSet(numbers));
    }

    // Return the number found in an array that is the first duplicate value
    // Example [2, 1, 3, 5, 3, 2]   output = 3

    // Brute Force Solution
    public static int firstDuplicateInIntArrayBruteForce(int[] numbers) {
        int minIndexOfDuplicateValue = numbers.length;

        // Nested for loops compare all values in the array and updates a variable
        // that holds the index of the first duplicate value found
        for (int i = 0; i < numbers.length; i++) {
           for (int j = i + 1; j < numbers.length; j++) {
               if (numbers[i] == numbers[j]) {
                   minIndexOfDuplicateValue = Math.min(minIndexOfDuplicateValue, j);
               }
           }
        }

        // If no duplicates were found minIndex will still be the length of the array
        if (minIndexOfDuplicateValue == numbers.length) return -1;
        else return numbers[minIndexOfDuplicateValue];
    }

    // Hash Set Solution
    public static int firstDuplicateInIntArrayWithHashSet(int[] numbers) {
        HashSet<Integer> integersSet = new HashSet<>();

        // If the number is not already in the hash set, add it to the hash set
        // If the number is already in the hash set, it is a duplicate and the solution to be returned
        for (int number : numbers) {
            if (integersSet.contains(number)) return number;
            else {
                integersSet.add(number);
            }
        }

        return -1;
    }



}
