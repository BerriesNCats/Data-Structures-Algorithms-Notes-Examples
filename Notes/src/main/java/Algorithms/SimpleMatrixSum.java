package Algorithms;

import java.util.Arrays;

public class SimpleMatrixSum {


  /**
   * Matrix
   *
   *    5   6   3
   *    2   3   5
   *    3   6   3
   *
   */
  public static void main(String[] args){
    int[][] numbers = new int[3][3];
    numbers[0][0] = 5;
    numbers[0][1] = 6;
    numbers[0][2] = 3;
    numbers[1][0] = 2;
    numbers[1][1] = 3;
    numbers[1][2] = 5;
    numbers[2][0] = 3;
    numbers[2][1] = 6;
    numbers[2][2] = 3;

    System.out.println(sumOfMatrix(numbers));
  }

  public static int sumOfMatrix(int[][] numbersMatrix) {
    int result = 0;
    for (int i = 0; i < numbersMatrix.length; i++) {
      for (int j = 0; j < numbersMatrix.length; j++) {
        result = result + numbersMatrix[i][j];
      }
    }
    return result;
  }

}
