package ca.jrvs.challenge.string;

public class ValidatePalindrome {

    /**
     * Write a recursive algorithm to validate
     * if a given String is a palindrom
     * Method fails on the empty String
     */
    public static boolean solution(String s) {
        if (s.length() < 2) {
            return true;
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length()-1)) {
            return solution(s.substring(1,s.length()-1));
        }
        return false;
    }
}
