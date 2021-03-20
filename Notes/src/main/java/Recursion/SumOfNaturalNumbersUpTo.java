package Recursion;

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

public class SumOfNaturalNumbersUpTo {

    public static void main(String[] args) {

        System.out.println(sumOfNaturalNumbersUpTo(50));
    }

    public static int sumOfNaturalNumbersUpTo(int number) {
        /** The base case is how recursion ends and is checked on each recursive call
         *    The Base Case for this method is when number == 1 as there are no
         *    smaller natural numbers to add to the summation */
        if (number == 1) return number;

        /** The recursive case is solvable by taking a piece of the problem and recursively
         *  solving a smaller sub problem.
         *    The recursive case for this method is when number is greater than 1 as there
         *    are smaller natural numbers that need to be added to the sum */
        else return number + sumOfNaturalNumbersUpTo(number - 1);
    }
}
