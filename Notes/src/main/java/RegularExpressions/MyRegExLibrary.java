package RegularExpressions;


import java.util.regex.Pattern;

public class MyRegExLibrary {

    // \d - a digit
    final static Pattern backslashLowerCaseD = Pattern.compile("[0-9]");
    // \D - a non-digit
    final static Pattern backslashUpperCaseD = Pattern.compile("[^0-9]");
    // \s - a whitespace character
    final static Pattern backslashLowerCaseS = Pattern.compile("[ \\t\\n\\f\\r]");
    // \S - a non whitespace character
    final static Pattern backslashUpperCaseS = Pattern.compile("[^ \\t\\n\\f\\r]");
    // \w - a word character
    final static Pattern backslashLowerCaseW = Pattern.compile("[a-zA-Z_0-9]");
    // \W - a non word character
    final static Pattern backslashUpperCaseW = Pattern.compile("[^a-zA-Z_0-9]");

    final static Pattern singleSentencePattern = Pattern.compile("[A-Z][^.?!]+[.?!]");
    final static Pattern wholeNumbersPattern = Pattern.compile("^\\d+$");
    final static Pattern alphanumericWithSpacesPattern = Pattern.compile("^[\\w ]+$");
    final static Pattern alphanumericWithoutSpacesPattern = Pattern.compile("^[\\w]+$");


    public static boolean isSingleSentence(String singleSentence) {
        return singleSentencePattern.matcher(singleSentence).matches();
    }

    public static boolean isWholeNumber(String number) {
        return wholeNumbersPattern.matcher(number).matches();
    }

    public static boolean containsOnlyAlphanumericWithSpaces(String string) {
        return alphanumericWithSpacesPattern.matcher(string).matches();
    }

    public static boolean containsOnlyAlphanumericWithoutSpaces(String string) {
        return alphanumericWithoutSpacesPattern.matcher(string).matches();
    }

}
