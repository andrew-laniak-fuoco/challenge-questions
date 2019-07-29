package ca.jrvs.challenge.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedTest {

    @Test
    public void mergeEmpty() {
        int[] one = new int[0];
        int[] two = new int[0];
        assertEquals(0,MergeSorted.solution(one,two).length);
    }

    @Test
    public void mergeSimple() {
        int[] one = {1,3,5};
        int[] two = {2,4,6};
        int[] expected = {1,2,3,4,5,6};
        assertArrayEquals(expected,MergeSorted.solution(one,two));
    }

    @Test
    public void mergeComplex() {
        int[] one = {1,2,5,10,500,89072};
        int[] two = {-500,1,1,1,6,7500};
        int[] expected = {-500,1,1,1,1,2,5,6,10,500,7500,89072};
        assertArrayEquals(expected,MergeSorted.solution(one,two));
    }
}