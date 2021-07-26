package Algorithms.LeetCode;

import java.util.Stack;

/**
 * LeetCode #0020
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is
 * valid. An input string is valid if the opening brackets matches the closing bracket and the brackets are in the
 * correct order.
 *
 *
 * Example Input
 *      string = "({{[]}})"
 *
 *      Output = true
 */
public class ValidParentheses {

    public static void main(String[] args) {
        String string = "({{[]}})";
        System.out.println(isValidParentheses(string));
        String falseString = "((()}";
        System.out.println(isValidParentheses(falseString));
        String leetcodeProblem = "()";
        System.out.println(isValidParentheses(leetcodeProblem));
    }

    public static boolean isValidParentheses(String string) {
        Stack<Character> parenthesesStack = new Stack<>();

        if (string.length() < 2) return false;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(' || string.charAt(i) == '{' || string.charAt(i) == '[') {
                parenthesesStack.push(string.charAt(i));
            } else if (string.charAt(i) == ')' && !parenthesesStack.isEmpty() && parenthesesStack.peek() == '(') {
                parenthesesStack.pop();
            } else if (string.charAt(i) == '}' && !parenthesesStack.isEmpty() && parenthesesStack.peek() == '{') {
                parenthesesStack.pop();
            } else if (string.charAt(i) == ']' && !parenthesesStack.isEmpty() && parenthesesStack.peek() == '[') {
                parenthesesStack.pop();
            }
        }
        return parenthesesStack.isEmpty();
    }

}
