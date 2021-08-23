package Algorithms.HackerRank;

import java.util.List;

public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int difference = 0;

        for (int i = 0; i < arr.size(); i++) {
            primaryDiagonal = primaryDiagonal + arr.get(i).get(i);
        }

        for (int i = 0, j = arr.size() - 1; i < arr.size(); i++, j--) {
            secondaryDiagonal = secondaryDiagonal + arr.get(i).get(j);
        }

        difference = Math.abs(primaryDiagonal - secondaryDiagonal);

        return difference;

    }
}
