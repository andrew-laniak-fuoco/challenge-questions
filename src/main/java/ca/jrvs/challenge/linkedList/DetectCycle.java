package ca.jrvs.challenge.linkedList;

public class DetectCycle {

    /**
     * (MOCK)
     * Returns true if a cycle is found within a
     * given linked list
     * Runs with O(1) space
     */
    public static boolean solution(LinkedList list) {
        Node fast = list.head();
        Node slow = list.head();

        // run as long as neither pointer is null
        while(fast != null && slow != null) {
            fast = fast.next();
            fast = fast.next();
            slow = slow.next();
            if(fast == slow) {
                return true; // if fast and slow point to the same Node then we have found a cycle
            }
        }
        // if one of the pointers becomes null then we have found the end of the list
        // meaning that there are no cycles
        return false;
    }
}
