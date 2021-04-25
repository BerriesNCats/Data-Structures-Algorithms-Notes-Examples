package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Result {

    /*
     * Complete the 'funWithAnagrams' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY text as parameter.
     */

    public static List<String> funWithAnagrams(List<String> text) {
        ArrayList<String> sortedWords = new ArrayList<>();
        ArrayList<String> unsortedWords = new ArrayList<>();
        for (String unsortedWord : text) {
            char[] wordArray = unsortedWord.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = Arrays.toString(wordArray);
            if (!sortedWords.contains(sortedWord)) {
                sortedWords.add(sortedWord);
                unsortedWords.add(unsortedWord);
            }
        }
        Collections.sort(unsortedWords);
        return unsortedWords;
    }

}

public class Anagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int textCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> text = IntStream.range(0, textCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<String> result = HackerRank.FindFactor.Result.funWithAnagrams(text);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
