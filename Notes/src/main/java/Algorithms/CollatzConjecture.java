package Algorithms;

public class CollatzConjecture {

  public static void main(String[] args) {
    collatzConjecture(1999484);
  }

  public static void collatzConjecture(int number) {
    int numberOfSteps = 0;

    while (number != 1) {
      numberOfSteps++;
      if (isEven(number)) {
        number = number / 2;
      } else {
        number = number * 3 + 1;
      }
      System.out.println(number);
    }
    System.out.println("Number of Steps to termination: " + numberOfSteps);
  }

  private static boolean isEven(int number) {
    return number % 2 == 0;
  }
}
