/*
 * Copyright David Amateau 2021.
 */

package Algorithms;

import java.util.HashSet;

public class PatternMatch {

    public static void main(String[] args) {
        String one = "amazing";
        String pattern = "010";

        System.out.println(binaryPatternMatching(pattern, one));
    }

    static int binaryPatternMatching(String pattern, String s) {
        int patternMatches = 0; // the number of pattern matches we have found
        // Creating a HashSet of vowels
        int patternLength = pattern.length();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
        boolean matchFound = true;

        // EXAMPLE
        // pattern = 010
        // s = amazing

        // This for loop will traverse the entire string who we are looking at to see
        // how many times it contains the pattern.
        for (int i = 0; i < s.length(); i++) {


            // This for loop will terminate each time the pattern length has been reached
            // If at that time the pattern matches, we add to the match found count
            // If it does not, we exit this for loop and continue searching the string
            for (int j = i; j < pattern.length(); j++) {
                // If the first character in the pattern is a 0
                // AND
                // the first character in the string is a vowel
                // OR
                // If the first character in the pattern is a 1
                // AND
                // the first character in the string is not a vowel
                if ((pattern.charAt(i) == '0' && vowels.contains(s.charAt(i))) ||
                        pattern.charAt(i) == '1' && !vowels.contains(s.charAt(i))) {
                    // So if this is true, we need to continue checking the rest of the pattern
                    matchFound = true;
                }  else {
                    matchFound = false;
                }
                // If when exiting the inner for loop who's length is that of the pattern, we have
                // always found the corresponding pattern, then this substring matches the pattern
                // and we should increase the count of matches found
                if (matchFound && patternLength == pattern.length()) patternMatches++;

            }

        }



        return patternMatches;
    }



}
