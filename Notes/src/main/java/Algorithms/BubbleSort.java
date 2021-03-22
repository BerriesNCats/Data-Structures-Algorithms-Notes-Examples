package Algorithms;

/**
 * This algorithm is known as bubble sort and works by comparing two elements at a time
 * and swapping the elements if the one that appears first is greater then the one that
 * comes after. It then shifts its pointers by 1 to compare the next two elements
 *
 * It requires two for loops as the entire array is not sorted in one pass but sorted by
 * having the largest value bubble to its correct position on each iteration.
 *              Quadratic Time
 *      BubbleSort is a O(n^2)
 *
 *
 * BubbleSort is therefore considered an inefficient algorithm because as the amount of data
 * increases the cost of operations increases exponentially.
 *
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {5, 18, 19, 2, 4, 75, 35, 234, 242, 645, 6, 24, 353 , 466};
        bubbleSort(numbers);
        StringBuilder arrayPrint = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) { arrayPrint.append(numbers[i]).append(", "); }
        System.out.println(arrayPrint.substring(0, arrayPrint.length() - 2));
    }

    /**
     *     Quadratic Time - O(n^2)
     * We must visit every element on each iteration and we must iterate through every element
     * for the amount of elements we are sorting. */
    public static void bubbleSort(int[] numbers) {

        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i + 1);
                }
            }
        }
    }
    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
