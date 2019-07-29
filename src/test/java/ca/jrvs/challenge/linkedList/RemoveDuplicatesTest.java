package ca.jrvs.challenge.linkedList;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    @Test
    public void noDuplicates() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(7);
        list.add(3);
        assertEquals(3,RemoveDuplicates.solution(list).size());
    }

    @Test
    public void oneDuplicate() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(1);
        assertEquals(3,RemoveDuplicates.solution(list).size());
    }

    @Test
    public void halfDuplicates() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(1);
        assertEquals(3,RemoveDuplicates.solution(list).size());
    }
}