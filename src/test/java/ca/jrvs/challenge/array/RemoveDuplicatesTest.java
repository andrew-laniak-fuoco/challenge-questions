package ca.jrvs.challenge.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    @Test
    public void noDups() {
        int[] array = {1,2,3,4,5};
        int[] newArray = RemoveDuplicates.solution(array);
        assertEquals(array.length, newArray.length);
    }

    @Test
    public void manyDups() {
        int[] array = {1,1,1,1,2,2,2,3,3,3,4,5};
        int[] newArray = RemoveDuplicates.solution(array);
        assertEquals(5, newArray.length);
    }

}