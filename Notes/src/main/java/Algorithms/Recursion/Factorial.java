package Algorithms.Recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(9));
    }

    public static int factorial(int number) {
        // Base Case
        if (number == 0) return 1;

        // Recursive case
        return number * factorial(number - 1);
    }
}
