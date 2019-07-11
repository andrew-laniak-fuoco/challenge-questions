package ca.jrvs.challenge.array;

public class RemoveValues {

    /**
     * Write an algorithm that removes all elements
     * that match a given value and returns the new length
     * This should be done in place
     */
    public static int[] solution(int[] array, int value) {
        int pointerBack = array.length-1;
        for(int pointerFront = 0; pointerFront <= pointerBack; pointerFront++) {
            if (array[pointerFront] == value ) {
                array[pointerFront] = array[pointerBack];
                array[pointerBack] = 0;
                pointerBack--;
                pointerFront--;
            }
        }

        return array;
    }
}
