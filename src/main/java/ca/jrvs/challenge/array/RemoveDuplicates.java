package ca.jrvs.challenge.array;

public class RemoveDuplicates {
    /**
     * Write an algorithm that removes
     * duplicate items from a sorted array
     * Assumes a non-empty array
     */
    public static int[] solution(int[] array) {
        if (array.length == 0) {
            return null;
        }

        int removedCount = 0;
        boolean[] removed = new boolean[array.length];

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i-1]) {
                removed[i] = true;
                removedCount++;
            }
        }

        int[] result = new int[array.length-removedCount];
        result[0] = array[0];
        int index = 1;

        for (int i = 1; i < removed.length; i++) {
            if (!removed[i]) {
                result[index] = array[index];
                index++;
            }
        }

        return result;
    }
}
