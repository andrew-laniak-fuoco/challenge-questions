package ca.jrvs.challenge.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DupElementsTest {

    @Test
    public void noDuplicate() {
        int[] array = {1,2,3};
        assertFalse(DupElements.solution(array));
    }

    @Test
    public void duplicate() {
        int[] array = {1,2,3,4,5,1};
        assertTrue(DupElements.solution(array));
    }

    @Test
    public void longDuplicate() {
        int[] array = {1,2,3,4,5,6,7,8,9,10,100,500,999,7};
        assertTrue(DupElements.solution(array));
    }
}