package ca.jrvs.challenge.linkedList;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicates {

    /**
     * Removes any element in a given linked list
     * The algorithm assumes the linked list is
     * unsorted
     * Returns the passed list back with only unique elements
     */
    public static LinkedList<Integer> solution(LinkedList<Integer> list) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (seen.contains(list.get(i))) { // check in O(1) time if this element has been seen
                list.remove(i);
                i--;
            } else {                // if not, add c to the hashtable
                seen.add(list.get(i));
            }
        }

        return list;
    }
}
