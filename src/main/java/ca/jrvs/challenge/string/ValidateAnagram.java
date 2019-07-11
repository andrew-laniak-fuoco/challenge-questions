package ca.jrvs.challenge.string;

import java.util.Arrays;
import java.util.HashMap;

public class ValidateAnagram {

    /**
     * Write an algorithm to test if a
     * given String is an anagram of another
     * (Sort approach gives O(nlogn) time)
     */
    public static boolean sortSolution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Write an algorithm to test if a
     * given String is an anagram of another
     * (HashMap approach gives O(n) time)
     */
    public static boolean hashMapSolution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sCount.containsKey(s.charAt(i))) {
                sCount.replace(s.charAt(i),sCount.get(s.charAt(i))+1);
            }
            if (tCount.containsKey(t.charAt(i))) {
                tCount.replace(t.charAt(i),tCount.get(t.charAt(i))+1);
            }
        }

        return sCount.equals(tCount);
    }
}
