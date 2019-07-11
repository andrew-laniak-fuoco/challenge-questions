package ca.jrvs.challenge.string;

import ca.jrvs.challenge.string.DigitLessString;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitLessStringTest {

    @Test
    public void onlyLetters() {
        assertTrue(!DigitLessString.solution("asgtjsabhtr"));
    }

    @Test
    public void both() {
        assertTrue(!DigitLessString.solution("0a1s2d3f4g5h6j7k8l9;l"));
    }

    @Test
    public void onlyDigits() {
        assertTrue(DigitLessString.solution("1234567890"));
    }
}