package ca.jrvs.challenge.bit;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest {

    @Test
    public void bitzero() {
        assertTrue(Even.solutionBit(0));
    }

    @Test
    public void bitone() {
        assertTrue(!Even.solutionBit(1));
    }

    @Test
    public void biteven() {
        assertTrue(Even.solutionBit(24));
    }

    @Test
    public void bitodd() {
        assertTrue(!Even.solutionBit(13));
    }

    @Test
    public void modzero() {
        assertTrue(Even.solutionMod(0));
    }

    @Test
    public void modone() {
        assertTrue(!Even.solutionMod(1));
    }

    @Test
    public void modeven() {
        assertTrue(Even.solutionMod(24));
    }

    @Test
    public void mododd() {
        assertTrue(!Even.solutionMod(13));
    }

}