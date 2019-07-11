package ca.jrvs.challenge.array;

import java.util.HashSet;


public class TwoSum {

    /**
     * Write an algorithm to find if there
     * are two integers in an array that add
     * to some other given integer
     * Runs in O(n) time
     */
    public static boolean solution(int[] numbers, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i : numbers) {
            if (seen.contains(target - i)) { // check in O(1) time if a matching int has been seen
                return true;
            } else {                        // if not, add integer to the hashtable
                seen.add(i);
            }
        }

        return false;
    }
}
