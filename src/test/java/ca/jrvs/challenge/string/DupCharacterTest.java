package ca.jrvs.challenge.string;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DupCharacterTest {

    @Test
    public void noDuplicate() {
        assertTrue(!DupCharacter.solution("abc"));
    }

    @Test
    public void duplicate() {
        assertTrue(DupCharacter.solution("aab"));
    }

    @Test
    public void longDuplicate() {
        assertTrue(DupCharacter.solution("abcdefgijklmnopqrstuvqxyza"));
    }
}