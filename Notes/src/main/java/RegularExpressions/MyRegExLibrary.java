package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegExLibrary {



    public static void main(String[] args) {

        String singleSentence = "I walked the cat to the moon today!";
        System.out.println(isSingleSentence(singleSentence));

    }

    private static boolean isSingleSentence(String singleSentence) {
        Pattern singleSentencePattern = Pattern.compile("[A-Z][^\\.?!]+[\\.?!]");
        Matcher singleSentenceMatcher = singleSentencePattern.matcher(singleSentence);
        return singleSentenceMatcher.matches();
    }
}
