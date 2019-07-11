package ca.jrvs.challenge.string;

import ca.jrvs.challenge.string.ValidatePalindrome;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatePalindromeTest {

    @Test
    public void noPalindrome() {
        assertTrue(!ValidatePalindrome.solution("abc"));
    }

    @Test
    public void evenPalindrome() {
        assertTrue(ValidatePalindrome.solution("abba"));
    }

    @Test
    public void oddPalindrome() {
        assertTrue(ValidatePalindrome.solution("abcdefgfedcba"));
    }

}