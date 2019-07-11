package ca.jrvs.challenge.array;

import ca.jrvs.challenge.array.TwoSum;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void noSum() {
        int[] numbers = {1,2,3,4,5};
        int target = 9;
        assertTrue(TwoSum.solution(numbers,target));
    }

    @Test
    public void yesSum() {
        int[] numbers = {1,2,3,4,5};
        int target = 4;
        assertTrue(TwoSum.solution(numbers,target));
    }

    @Test
    public void sumWithNegative() {
        int[] numbers = {1,-1,3,-4,5};
        int target = -1;
        assertTrue(TwoSum.solution(numbers,target));
    }

}