package Algorithms.PrincetonTextBook;

public class SimpleArrayAlgos {

    public static double maxInArray(double[] numbers) {
        double max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static double averageInArray(double[] numbers) {
        int numbersInArray = numbers.length;
        double sum = 0.0;

        for (int i = 0; i < numbersInArray; i++) {
            sum += numbers[i];
        }

        return sum / numbersInArray;
    }

    public static double[] reverseArray(double[] numbers) {
        int lengthOfArray = numbers.length;

        for (int i = 0; i < lengthOfArray / 2; i++) {
            double temp = numbers[i];
            numbers[i] = numbers[lengthOfArray - i - 1];
            numbers[lengthOfArray - i - 1] = temp;
        }

        return numbers;
    }

}
