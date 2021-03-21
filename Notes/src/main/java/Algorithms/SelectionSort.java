package Algorithms;

public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 6, 2, 74, 67, 11, 24, 52, 36, 47, 85, 390};

        selectionSort(numbers);

        for (int i = 0; i < numbers.length; i++) { System.out.println(numbers[i]); }


    }

    /**
     *  In selection sort we require a variable 'index' to hold a pointer to the lowest
     *  value that we find. If we find a lower value we reassign the pointer 'index' to
     *  the index with the lower value. When we have looked at all the elements in the
     *  array, we swap the lowest value to its correction position which we point at
     *  with the variable 'i'.
     *
     *      Quadratic time - O(N^2)
     *  Selection Sort is an inefficient algorithm performing in quadratic time.
     */

    private static void selectionSort(int[] numbers) {
        int arraySize = numbers.length;
        for (int i = 0; i < arraySize -1; i++) {
            int index = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (numbers[j] < numbers[index]) index = j;
            }

        swap(numbers, i, index);
        }
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
