package Algorithms.CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.HashSet;

public class ArraysAndStrings {

    public static void main(String[] args) {
        System.out.println("Is Each Character In String Unique");
        System.out.println(isEachCharacterInStringUnique("abcdeflkjs"));
        System.out.println(isEachCharacterInStringUnique("aa"));
        System.out.println(isEachCharacterInStringUnique("abcdsfaspfkljsdfa"));
    }

    public static boolean isEachCharacterInStringUnique(String string) {
        HashSet<Character> charSet = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            if (charSet.contains(string.charAt(i))) return false;
            else {
                charSet.add(string.charAt(i));
            }
        }
        return true;
    }
}
