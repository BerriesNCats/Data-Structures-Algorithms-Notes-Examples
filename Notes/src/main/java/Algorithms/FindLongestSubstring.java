/*
 * Copyright David Amateau 2021.
 */

package Algorithms;

import java.util.HashSet;

public class FindLongestSubstring {

    public static void main(String[] args) {
        String string = "Somestringtypething";

        System.out.println(findLongestSubstringWithoutRepeatingCharacters(string));
    }

    public static int findLongestSubstringWithoutRepeatingCharacters(String string) {
        int aPointer = 0;
        int bPointer = 0;
        int max = 0;

        HashSet<Character> characters = new HashSet<>();

        while (bPointer < string.length()) {
            if (!characters.contains(string.charAt(bPointer))) {
                characters.add(string.charAt(bPointer));
                bPointer++;
                max = Math.max(characters.size(), max);
            } else {
                characters.remove(string.charAt(aPointer));
                aPointer++;
            }
        }
        return max;
    }
}
