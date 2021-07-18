package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String stringOne = "aaaaabcdddeeccffaa";

        System.out.println(firstNonRepeatingCharacterWithTwoForLoops(stringOne));
        System.out.println(firstNonRepeatingCharacterWithHashMap(stringOne));

    }

    // Brute Force Solution
    public static char firstNonRepeatingCharacterWithTwoForLoops(String string) {
        for (int i = 0; i < string.length(); i++) {
            boolean duplicateFound = false;

            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j) && i != j) {
                    // If we find a duplicate, break out of this for loop and return to the
                    // outer for loop to reinitialize i and check the next char for duplicates
                    duplicateFound = true;
                    break;
                }
            }
            // If no duplicate is found, the char at i is non-repeating and is the answer returned
            if (!duplicateFound) return string.charAt(i);
        }
        // return '_' if no non-repeating character is found
        return '_';
    }

    // Data Structure Enhanced Solution
    public static char firstNonRepeatingCharacterWithHashMap(String string) {
        HashMap<Character, Integer> characterMap = new HashMap<>();

        // Map all chars in the String to the HashMap
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (characterMap.containsKey(currentChar)) {
                characterMap.put(currentChar, characterMap.get(currentChar) + 1 );
            } else {
                characterMap.put(currentChar, 1);
            }
        }

        // Loop through again to find the first char with a value of 1 which denotes it being non repeating and the
        // answer to the solution so return that char
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (characterMap.get(currentChar) == 1) return currentChar;
        }

        return '_';
    }

}
