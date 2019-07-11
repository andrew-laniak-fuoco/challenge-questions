package ca.jrvs.challenge.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateParenthesesTest {

    @Test
    public void noParentheses() {
        assertTrue(ValidateParentheses.solution("abc"));
    }

    @Test
    public void manyParentheses() {
        assertTrue(ValidateParentheses.solution("((a(b(c))())d)"));
    }

    @Test
    public void moreLeftParentheses() {
        assertTrue(!ValidateParentheses.solution("((a(b(c))()d)"));
    }

    @Test
    public void moreRightParentheses() {
        assertTrue(!ValidateParentheses.solution("((a(b(c)))d))"));
    }

}