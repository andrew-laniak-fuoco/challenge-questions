package ca.jrvs.challenge.string;

import java.util.HashSet;

public class DupCharacter {

    /**
     * Write an algorithm to find if a given
     * String contains duplicate characters
     * Must run in O(n) time
     */
    public static boolean solution(String s) {
        char[] characters = s.toCharArray();
        HashSet<Character> seen = new HashSet<>();

        for (char c : characters) {
            if (seen.contains(c)) { // check in O(1) time if character c has been seen
                return true;
            } else {                // if not, add c to the hashtable
                seen.add(c);
            }
        }

        return false;
    }
}
