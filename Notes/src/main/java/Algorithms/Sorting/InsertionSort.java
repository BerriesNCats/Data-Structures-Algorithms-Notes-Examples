package Algorithms.Sorting;
/**
 *
 *      In Insertion Sort we declare that the first index is in its correct position in
 *      the sorted partition of the array by itself and start by comparing the element at
 *      index '1' which is the value we are going to insert with the elements that are
 *      already in the sorted partition of the array. We are then able to place the
 *      'newElement' we are inserting into its correct position.
 *
 *          Insertion Sort is a O(n^2) performing in Quadratic Time - Stable
 */

public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = {5, 26, 2376, -53, 2662, 3, 15, 23, 857, 64};
        insertionSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    /**
     *  - We assume the element at position 0 is in its current position in the sorted partition
     *  - We keep going as long as the 'firstUnsortedIndex' is less then the length of the array
     *  - After each iteration the 'firstUnsortedIndex' will be incremented by 1
     *  - We save the value we are going to insert as 'newElement'
     *  - We declare i outside the loop as we need it after
     *  - We assign 'i' to firstUnsortedIndex and continue to traverse the array until we either
     *      reach  0 which is the front of the array if our 'newElement' is the lowest value and
     *      will be inserted there or as long as the element we are currently looking at is
     *      greater then the element we are trying to insert.
     */

    public static void insertionSort(int[] numbers) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < numbers.length; firstUnsortedIndex++) {
            int newElement = numbers[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && numbers[i - 1] > newElement; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[i] = newElement;
        }
    }
}
