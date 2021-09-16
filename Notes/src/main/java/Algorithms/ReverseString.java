/*
 * Copyright David Amateau 2021.
 */

package Algorithms;

public class ReverseString {

    public void reverseString(char[] charArray) {
        int aPointer = 0;
        int bPointer = charArray.length - 1;

        while (aPointer <= bPointer) {
            char temp = charArray[aPointer];
            charArray[aPointer] = charArray[bPointer];
            charArray[bPointer] = temp;

            aPointer++;
            bPointer--;
        }
    }

    public String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
