package Algorithms.Sorting;

/**
 *      Selection Sort works by traversing the array and looking for the largest element we can
 *       find from what has yet to be sorted.
 *      Once we have traversed the array and found the largest element, we swap it with the last
 *       element in the unsorted portion of the array.
 *
 *      Note that we could also look for the smallest element and swap it with the first element
 *       that has yet to be sorted.
 *
 *       Selection Sort is an O(N^2) algorithm performing in Quadratic Time - Unstable
 */

public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 6, 2, 74, 67, 11, 24, 52, 36, 47, 85, 390};
        selectionSort(numbers);
        for (int i = 0; i < numbers.length; i++) { System.out.println(numbers[i]); }
    }

    /**
     *      - We traverse the arrays elements with 'i'
     *      - We store the largest value we find with 'largestValue'
     *      - We keep track of the position we are going to place the largest value in with 'lastUnsortedIndex'
     *      - We swap 'largestValue' with 'lastUnsortedIndex'  */

    private static void selectionSort(int[] numbers) {
        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestValue = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (numbers[i] > numbers[largestValue]) {
                    largestValue = i;
                }
            }
            swap(numbers, largestValue, lastUnsortedIndex);
        }
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
