package General.ExpandableArray;

/**
 * This class provides methods for working with an array that expands * to include any positive index value supplied by the caller.
 */
public class ExpandableArray {

    String[] expandableArray;
    int arraySize;


    /**
     * Creates a new expandable array with no elements. */
    public ExpandableArray() {
//. . . You fill in the implementation . . .
        expandableArray = new String[0];

    }
    /**
     * Sets the element at the given index position to the specified.
     * value. If the internal array is not large enough to contain that
     * element, the implementation expands the array to make room. */
    public void set(int index, Object value) {
        if (index > expandableArray.length) {
            String[] tempArray = expandableArray;
            expandableArray = new String[index + 1];
            System.arraycopy(tempArray, 0, expandableArray, 0, tempArray.length);
            expandableArray[index] = String.valueOf(value);
        }
    }
    /**
     * Returns the element at the specified index position, or null if
     * no such element exists. Note that this method never throws an
     * out-of-bounds exception; if the index is outside the bounds of * the array, the return value is simply null.
     */
    public Object get(int index) {
        if (expandableArray[index] != null) { return expandableArray[index]; }
        return null;
    }
}