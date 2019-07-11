package ca.jrvs.challenge.array;

import ca.jrvs.challenge.array.MissingNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    int[] arrone = {0,5,1,8,3,7,2,4};       // missing 6
    int[] arrtwo = {1,2,3,4,5,6,7,8,9};     // missing 0
    int[] arrthree = {5,9,4,8,3,7,2,6,1,0}; // missing 10

    @Test
    public void testOneMath() {
        assertEquals(6, MissingNumber.mathSolution(arrone));
    }

    @Test
    public void testTwoMath() {
        assertEquals(0,MissingNumber.mathSolution(arrtwo));
    }

    @Test
    public void testThreeMath() {
        assertEquals(10,MissingNumber.mathSolution(arrthree));
    }

    @Test
    public void testOneArray() {
        assertEquals(6,MissingNumber.arraySolution(arrone));
    }

    @Test
    public void testTwoArray() {
        assertEquals(0,MissingNumber.arraySolution(arrtwo));
    }

    @Test
    public void testThreeArray() {
        assertEquals(10,MissingNumber.arraySolution(arrthree));
    }

}