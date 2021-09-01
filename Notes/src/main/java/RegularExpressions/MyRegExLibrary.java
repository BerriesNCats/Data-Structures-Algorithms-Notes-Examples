package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegExLibrary {

    final static Pattern singleSentencePattern = Pattern.compile("[A-Z][^\\.?!]+[\\.?!]");

    public static void main(String[] args) {
        System.out.println(isSingleSentence("I walked the cat to the moon Today!"));
        System.out.println(isSingleSentence("roses are red, violets are blue"));

    }

    public static boolean isSingleSentence(String singleSentence) {
        return singleSentencePattern.matcher(singleSentence).matches();
    }
}
