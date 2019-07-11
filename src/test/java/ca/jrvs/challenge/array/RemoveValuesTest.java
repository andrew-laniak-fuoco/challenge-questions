package ca.jrvs.challenge.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoveValuesTest {

    @Test
    public void noRemoval() {
        int[] array = {1,2,3,4,5};
        int value = 0;
        assertTrue(Arrays.equals(array,RemoveValues.solution(array,value)));
    }

    @Test
    public void removeFromBack() {
        int[] array = {1,2,3,4,5,6,6,6};
        int[] expectedArray = {1,2,3,4,5,0,0,0};
        int value = 6;
        assertTrue(Arrays.equals(expectedArray,RemoveValues.solution(array,value)));
    }

    @Test
    public void removeFromFront() {
        int[] array = {1,1,1,2,3,4,5};
        int[] expectedArray = {5,4,3,2,0,0,0};
        int value = 1;
        assertTrue(Arrays.equals(expectedArray,RemoveValues.solution(array,value)));
    }

    @Test
    public void removeFromMiddle() {
        int[] array = {1,9,2,9,3,9,4,9,5,9};
        int[] expectedArray = {1,5,2,4,3,0,0,0,0,0};
        int value = 9;
        assertTrue(Arrays.equals(expectedArray,RemoveValues.solution(array,value)));
    }



}