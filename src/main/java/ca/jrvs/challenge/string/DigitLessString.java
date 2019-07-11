package ca.jrvs.challenge.string;

public class DigitLessString {

    /**
     * Tests if a given String contains
     * no digits
     */
    public static boolean solution(String s) {
        int zeroVal = 48;
        int nineVal = 57;

        char[] characters = s.toCharArray();

        for (char c : characters) {
            if (!(c >= zeroVal && c <= nineVal)) {
                return false;
            }
        }

        return true;
    }
}
