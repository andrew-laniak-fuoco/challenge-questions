package ca.jrvs.challenge.string;

import ca.jrvs.challenge.string.ValidateAnagram;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateAnagramTest {

    String equalOne = "abc";
    String equalTwo = "abc";
    String anagramOne = "abdc";
    String anagramTwo = "cabd";
    String nonagram = "bad";

    @Test
    public void testEqual() {
        assertTrue(ValidateAnagram.sortSolution(equalOne,equalTwo));
        assertTrue(ValidateAnagram.hashMapSolution(equalOne,equalTwo));
    }

    @Test
    public void testTrue() {
        assertTrue(ValidateAnagram.sortSolution(anagramOne,anagramTwo));
        assertTrue(ValidateAnagram.hashMapSolution(anagramOne,anagramTwo));
    }

    @Test
    public void testFalse() {
        assertTrue(!ValidateAnagram.sortSolution(anagramOne,nonagram));
        assertTrue(!ValidateAnagram.hashMapSolution(anagramOne,nonagram));
    }
}