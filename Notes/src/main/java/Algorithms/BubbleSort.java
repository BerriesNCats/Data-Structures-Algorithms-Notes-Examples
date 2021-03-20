package Algorithms;

/**
 * This algorithm is known as bubble sort and works by comparing two elements at a time
 * and swapping the elements if the one that appears first is greater then the one that
 * comes after. It then shifts its pointers by 1 to compare the next two elements
 *
 * It requires two for loops as the entire array is not sorted in one pass but sorted by
 * having the largest value bubble to its correct position on each iteration.
 *              Quadratic Time
 *      BubbleSort is a O(N2) (N2 being N to the power of 2)
 *
 *
 * BubbleSort is therefore considered an inefficient algorithm because as the amount of data
 * increases the cost of operations increases exponentially.
 *
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {5, 18, 19, 2, 4, 75, 35, 234, 242, 645, 6, 24, 353 , 466};
        array = bubbleSort(array);
        StringBuilder arrayPrint = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            arrayPrint.append(array[i]).append(", ");
        }
        System.out.println(arrayPrint.substring(0, arrayPrint.length() - 2));

    }

    /**
     *      i serves as a pointer to what has already been sorted
     *      j serves as a pointer to the two elements being compared
     *      since we determine the first element by locating it the left of j, on the first
     *      run j starts as 1 so the pointer will point to j - 1 which is 0 and j which is 1
     *      the temp is used to hold an element being swapped so it is not erased in the process
     *      of swapping
     *
     *              Quadratic Time - O of N to the power of 2
     * We must visit every element on each iteration and we must iterate through every element
     * for the amount of elements we are sorting. */
    public static int[] bubbleSort(int[] array) {
        int numberOfElements = array.length;
        int temp = 0;
        for (int i = 0; i < numberOfElements; i++) {
            for (int j = 1; j < (numberOfElements - i); j++) {
                // Swap the elements if the one before is greater than the one after
                // To swap two elements you need a place to store the one being swapped
                if (array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
