package RegularExpressions;


import java.util.regex.Pattern;

public class MyRegExLibrary {

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
