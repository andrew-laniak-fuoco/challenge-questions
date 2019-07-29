package ca.jrvs.challenge.array;

public class MergeSorted {

    /**
     * Takes two sorted arrays and returns a new
     * sorted array that contains all the elements
     * from both given arrays
     */
    public static int[] solution(int[] arrOne, int[] arrTwo) {
        int[] result = new int[arrOne.length + arrTwo.length];

        int onePointer = 0;
        int twoPointer = 0;
        for (int i = 0; i < result.length; i++) {
            int one = arrOne[onePointer];
            int two = arrTwo[twoPointer];
            if (one < two) {
                result[i] = one;
                onePointer++;
                if (onePointer == arrOne.length) {
                    onePointer--; // make sure the pointer does not go out of bounds
                    arrOne[onePointer] = Integer.MAX_VALUE; // make sure that the last element is not picked more than once
                }
            } else {
                result[i] = two;
                twoPointer++;
                if (twoPointer == arrTwo.length) {
                    twoPointer--;
                    arrTwo[twoPointer] = Integer.MAX_VALUE;
                }
            }
        }

        return result;
    }
}
