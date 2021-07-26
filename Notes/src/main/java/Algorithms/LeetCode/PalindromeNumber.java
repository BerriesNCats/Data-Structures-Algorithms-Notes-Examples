package Algorithms.LeetCode;

/**
 * LeetCode #0009
 *
 * Given an integer x, return true if x is palindrome integer. An integer is a palindrome when it reads the same
 * backward as forward. For example, 121 is palindrome while 123 is not. Treat negative numbers as inherently
 * non-palindromic due to the negative symbol.
 *
 * Example Input
 *      number = 12321
 *
 *      Output = true
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 123464321;

        System.out.println(isNumberPalindrome(number));
    }

    /**
     * Steps
     * - if the number is negative, it is inherently not palindromic - return false
     * - if the number is positive, convert it to a string
     * - create two pointers, i & j
     * - if i & j are equal the current indexes being checked are palindromic
     * - to check the next indexes, increase i and decrease j
     * - if at any point i does not equal j, it is not a palindrome - return false
     * - if by the time we have reached halfway through the array and all indexes at i and j are equal we exit the for
     *   loop and return true
     *
     *
     * @param number the number whose value we are checking to see if it is palindromic
     * @return the boolean value representing wether or not the number is a palindrome
     */
    public static boolean isNumberPalindrome(int number) {
        if (number < 0) return false;
        // convert number to a string to compare chars
        String numberAsString = String.valueOf(number);
        // j serves as our right index pointer
        int j = numberAsString.length() - 1;

        // i serves as our left index pointer
        // we traverse half the length of the string as we compare chars at i and j
        for (int i = 0; i < (numberAsString.length() / 2); i++) {

            // if the chars at i and j are equal, we can continue checking with the for loop incrementing i
            // and manually decrementing j
            if (numberAsString.charAt(i) == numberAsString.charAt(j)) {
                j--;
            } else { // if we find any that don't match we return false;
                return false;
            }
        }
        // we return true if we have traversed the string and always found matches
        return true;
    }
}
