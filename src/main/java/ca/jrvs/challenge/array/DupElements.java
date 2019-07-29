package ca.jrvs.challenge.array;

import java.util.HashSet;

public class DupElements {

    /**
     * Write an algorithm to find if a given
     * array contains duplicate elements
     * Returns true if at least one duplicate is found
     * within the array
     */
    public static boolean solution(int[] array) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i : array) {
            if (seen.contains(i)) { // check in O(1) time if character c has been seen
                return true;
            } else {                // if not, add c to the hashtable
                seen.add(i);
            }
        }

        return false;
    }
}
