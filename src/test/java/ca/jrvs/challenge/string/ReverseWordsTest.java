package ca.jrvs.challenge.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsTest {

    @Test
    public void singleWord() {
        String str = "hello";
        assertEquals(str, ReverseWords.solution(str));
    }

    @Test
    public void multipleWords() {
        String str = "hello world how are you?";
        String reverse = "you? are how world hello";
        assertEquals(reverse, ReverseWords.solution(str));
    }

    @Test
    public void multipleSpaces() {
        String str = "hello  world      how  are  you?";
        String reverse = "you? are how world hello";
        assertEquals(reverse, ReverseWords.solution(str));
    }
}