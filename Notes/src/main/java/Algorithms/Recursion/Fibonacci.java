package Algorithms.Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(2));
    }

    public static int fibonacci(int number) {
        // Base Case
        if (number <= 1) return number;
        // Recursive Case
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
