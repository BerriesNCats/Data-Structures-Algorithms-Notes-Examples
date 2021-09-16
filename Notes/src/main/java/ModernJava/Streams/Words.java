package ModernJava.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Words {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
    List<Integer> wordLengths = getWordLengths(words);

    wordLengths.forEach(System.out::println);
  }

  private static List<Integer> getWordLengths(List<String> words) {
    return words.stream()
        .map(String::length)
        .collect(Collectors.toList());
  }
}
