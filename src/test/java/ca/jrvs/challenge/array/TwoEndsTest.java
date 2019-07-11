package ca.jrvs.challenge.array;

import ca.jrvs.challenge.array.TwoEnds;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoEndsTest {

    @Test
    public void tesOne() {
        int small = 0;
        int large = 5;
        int[] array = {0,1,2,3,4,5};

        int[] answer = TwoEnds.solution(array);
        assertEquals(small,answer[0]);
        assertEquals(large,answer[1]);
    }

    @Test
    public void testTwo() {
        int small = -100;
        int large = 100;
        int[] array = {0,1,2,-100,4,100};

        int[] answer = TwoEnds.solution(array);
        assertEquals(small,answer[0]);
        assertEquals(large,answer[1]);
    }

    @Test
    public void testThree() {
        int[] array = {4};

        int[] answer = TwoEnds.solution(array);
        assertEquals(4,answer[0]);
        assertEquals(4,answer[1]);
    }


}