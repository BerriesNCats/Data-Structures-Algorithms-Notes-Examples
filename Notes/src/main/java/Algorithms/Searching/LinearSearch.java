/*
 * Copyright David Amateau 2021.
 */

package Algorithms.Searching;

import java.util.List;

public class LinearSearch {

    public static int linearSearchForIntegerIndex(List<Integer> elements, int element) {
        // If the element at the current index is the element we are looking for return that index
        for (int index = 0; index < elements.size(); index++) {
            if (elements.get(index) == element) return index;
        }
        // If the element is not present in the list return -1
        return -1;
    }
}
