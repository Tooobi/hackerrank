package de.tooobi.hackerrank;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Anagram {

    // ----------------------
    // Solution 1
    // ----------------------
    private static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> chars = countIndividualChars(b);

        for (char characterOfB : chars.keySet()) {

            int numberOfCharInA = countNumberOfCharsInWord(a, characterOfB);
            if (numberOfCharInA == chars.get(characterOfB)) {
                return true;
            }
        }
        return false;
    }

    private static Map<Character, Integer> countIndividualChars(String b) {
        Map<Character, Integer> chars = new HashMap();

        char[] charsOfB = b.toCharArray();
        for (char charOfB : charsOfB) {
            addCharAndCountToMap(chars, charOfB);
        }
        return chars;
    }

    private static void addCharAndCountToMap(Map<Character, Integer> chars, char charOfB) {
        if (chars.containsKey(charOfB)) {
            int numberOfCharsOfB = chars.get(charOfB);
            chars.put(charOfB, ++numberOfCharsOfB);
        } else {
            chars.put(charOfB, 1);
        }
    }

    private static int countNumberOfCharsInWord(String word, char character) {
        int i = StringUtils.countMatches(word.subSequence(0, word.length() - 1), character);
        return i;
    }


    // ----------------------
    // Solution 2
    // ----------------------
    static boolean isAnagram2(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        String charsSortedA = getCharsSorted(a);
        String charsSortedB = getCharsSorted(b);
        if (charsSortedA.equals(charsSortedB)) {
            return true;
        }
        return false;
    }

    private static String getCharsSorted(String a) {
        char[] chars = a.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram2(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
