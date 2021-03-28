package Algorithms.Sorting;

/**
 * Merge Sort functions using recursion and is a divide and conquer algorithm that is split
 * into two distinct phases.
 *
 * The first phase is called the splitting phase and is preparation which will make the second
 * phase faster. It works by splitting the array into left and right sides continuously until
 * every element is in a single element array.
 *
 * The second phase is called the Merging Phase which mergers every left and right pair into a
 * sorted array of two elements and then four, etc until you are left with a single sorted
 * array.
 *
 *      O(nLogn) - base 2 - Stable
 */

public class MergeSort {

    /**
     *   Merging Process
     *      - We merge sibling left and right arrays
     *      - We create a temporary array large enough to hold all the elements in the array
     *          we're merging
     *      - We set 'i' to the first index of the left array, and 'j' to the first index of
     *          the right array
     *      - We compare left[i] to right[j]. If left is smaller, we copy it to the temp array
     *          and increment 'i' by 1. If the right is smaller, we copy it to the temp array
     *          and increment 'j' by 1.
     *      - We repeat this process until all elements in the two arrays have been processed
     *      - At this point, the temporary array contains the merged values in sorted order
     *      - We then copy this temporary array back to the original input array, at the
     *          correct positions.
     *      - If the left array is at positions x to y, and the right array is at positions
     *          y + 1 to z, then after the copy, positions x to z will be sorted in the
     *          original array
     */

    public static void main(String[] args) {
        int[] numbers = {3, 52, 264, 2346, 1, -42, 0, 054, 252, 11, -4, 99};
        mergeSort(numbers, 0, numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void mergeSort(int[] numbers, int start, int end) {
            // Base Case
            // If the array is of a length of 0 or 1 return
        if (end - start < 2) return;

            // Recursive Case
        int middle = (start + end) / 2;
        // Left part of the array
        mergeSort(numbers, start, middle);
        // Right part of the array
        mergeSort(numbers, middle, end);
        // merging the arrays
        merge(numbers, start, middle, end);
    }

    public static void merge(int[] numbers, int start, int middle, int end) {
        // If the last element in the left partition is less than the first element
        // in the right partition, then the rest of the arrays are already sorted.
        if (numbers[middle - 1] <= numbers[middle]) return;

        int i = start;
        int j = middle;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while (i < middle && j < end) {
            temp[tempIndex++] = numbers[i] <= numbers[j] ? numbers[i++] : numbers[j++];
        }

        System.arraycopy(numbers, i, numbers, start + tempIndex, middle - i);
        System.arraycopy(temp, 0, numbers, start, tempIndex);
    }

}
