package Algorithms.HackerRank.FindFactor;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'pthFactor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER n
     *  2. LONG_INTEGER p
     */

    public static long pthFactor(long n, long p) {
        // Write your code here
        ArrayList<Long> factorsOfN = new ArrayList<>();
        long currentNumber = 1;
        while (currentNumber * currentNumber <= n) {
            if (n % currentNumber == 0) {
                factorsOfN.add(currentNumber);
                if (n / currentNumber != currentNumber) {
                    factorsOfN.add(n / currentNumber);
                }
            }
            currentNumber++;
        }

        Collections.sort(factorsOfN);
        int indexWeWant = (int) p - 1;
        if (indexWeWant > factorsOfN.size()) {
            return 0;
        }
        return factorsOfN.get(indexWeWant);
    }


}

public class FindTheFactor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long p = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.pthFactor(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

