package ca.jrvs.challenge.bit;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowTwoTest {

    @Test
    public void one() {
        assertTrue(PowTwo.solution(1));
    }

    @Test
    public void pow() {
        assertTrue(PowTwo.solution(512));
    }

    @Test
    public void notPow() {
        assertTrue(!PowTwo.solution(513));
    }

    @Test
    public void negPow() {
        assertTrue(PowTwo.solution(-1024));

    }

}