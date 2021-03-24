package Algorithms.Recursion;

/**
 *
 * A problem can be solved recursively if it is composed of a collection of identical or
 * similar sub problems that are smaller than the original
 *
 * To solve a problem recursively you must first establish the base case which must be
 * something you can compute, solve and predict otherwise the recursive method would
 * never end and would continue to call itself forever.
 *
 * Secondly you must establish the recursive case which needs to be a smaller sub problem
 * that progresses towards the terminating base case.
 */

public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abbcccddddeeeeeddddcccbba"));

    }

    public static boolean isPalindrome(String word) {
        /**
         * Base Case
         * If the length of the word is 1 or less than 2, then the word is a palindrome
         * and returns true.
         * Note that this method overall will only return true if all the subsequent recursive
         * calls also return true
         */
        if (word.length() < 2) return true;

        /**
         * Recursive Case
         * Compare the first and last letter of the word. If they match make a recursive call
         * sending a substring of the word that removes the first and last letter as they have
         * been checked and matched.
         */
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrome(word.substring(1, word.length()-1));
        } else return false;
    }
}
