/*
 * Copyright David Amateau 2021.
 */

package Algorithms;

public class DigitsManip {

    public static void main(String[] args) {
        int number = 1234;
        System.out.println(digitsManipulations(number));
    }

    public static int digitsManipulations(int n) {

        String string = String.valueOf(n);
        int product = 1;
        int sum = 0;

        for (int i = 0; i < string.length(); i++) {
            int currentChar = Integer.parseInt(String.valueOf(string.charAt(i)));
            product *= currentChar;
            sum += currentChar;
        }

        return product - sum;

    }
}
