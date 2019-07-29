package ca.jrvs.challenge.other;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovingAverageTest {

    @Test
    public void smallAverage() {
        double[] stream = {1.0,2.0,3.0};
        double average = 2.0;
        assertEquals(average,MovingAverage.solution(stream),0.0001);
    }

    @Test
    public void bigAverage() {
        double[] stream = {1.5,500.17,561.02,9.043,18.03,468.025};
        double average = 259.63133333;
        assertEquals(average,MovingAverage.solution(stream),0.0001);
    }

    @Test
    public void negativeAverage() {
        double[] stream = {-1.0,2.0,-4.0};
        double average = -1.0;
        assertEquals(average,MovingAverage.solution(stream),0.0001);
    }
}