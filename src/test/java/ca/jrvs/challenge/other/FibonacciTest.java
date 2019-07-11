package ca.jrvs.challenge.other;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void recursiveTestZero() {
        assertEquals(0, Fibonacci.recusiveSolution(0));
    }

    @Test
    public void recursiveTestOne() {
        assertEquals(1, Fibonacci.recusiveSolution(1));
    }

    @Test
    public void recursiveTestBig() {
        assertEquals(89, Fibonacci.recusiveSolution(11));
    }

    @Test
    public void dynamicTestZero() {
        assertEquals(0, Fibonacci.dynamicSolution(0));
    }

    @Test
    public void dynamicTestOne() {
        assertEquals(1, Fibonacci.dynamicSolution(1));
    }

    @Test
    public void dynamicTestBig() {
        assertEquals(89, Fibonacci.dynamicSolution(11));
    }
}