package ca.jrvs.challenge.array;

public class MissingNumber {

    /**
     * Given an unordered array of integers
     * from 0 to n, find the one number that
     * is missing in the sequence
     * Runs in O(n) time
     */
    public static int mathSolution(int[] array) {
        int n = array.length;
        int expectedSum = (n * (n + 1)) / 2;
        int realSum = 0;

        for (int i : array) {
            realSum += i;
        }

        return expectedSum - realSum;
    }

    /**
     * Given an unordered array of integers
     * from 0 to n, find the one number that
     * is missing in the sequence
     * Runs in O(n) time
     */
    public static int arraySolution(int[] array) {
        int[] sorted = new int[array.length + 1];

        for (int i : array) {
            sorted[i] = i;
        }

        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] == 0) {
                return i;
            }
        }

        return 0;
    }
}
