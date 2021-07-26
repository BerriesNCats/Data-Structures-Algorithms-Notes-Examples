package Algorithms.LeetCode;

/**
 * LeetCode #0014
 *
 * Write a function to find the longest common prefix string amongst an array of strings. If there is no common
 * prefix, return an empty string "".
 *
 * Example Input
 *      strings = ["flower", "flow, "flight"]
 *
 *      Output = "fl"
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strings));
    }

    /**
     * Steps
     * - if there is only one string in the array return an empty string
     * - set the prefix as the first string in the array
     * - loop through the strings in the array
     * - if the current string being compared to the first string in the array does not contain our current prefix
     * - remove the last letter in the current prefix until the first string and the current string share a common
     *   prefix
     * - repeat for all strings in the array
     * - return the longest common prefix that was found in all strings in the array
     *
     * @param strings an array of strings
     * @return the longest common prefix found in the array of strings
     */
    public static String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) return "";

        // set the prefix as the first string in the array
        String prefix = strings[0];

        // loop through the strings in the array
        for (int i = 1; i < strings.length; i++) {
            // while the index of our prefix is not found in the current string
            // meaning while our prefix is not yet reduced to being common and found at the beginning
            // of the current string we are looking at, continue to reduce the size of the prefix which
            // is the first string in the array by 1 until it is contained in the current string
            while (strings[i].indexOf(prefix) != 0) {
                // reduce the size of the prefix by 1 char at the end
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

}
