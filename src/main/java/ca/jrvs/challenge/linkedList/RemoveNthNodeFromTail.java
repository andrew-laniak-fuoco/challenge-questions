package ca.jrvs.challenge.linkedList;

public class RemoveNthNodeFromTail {

    /**
     * (MOCK)
     * Removes the nth last node from a given linked list
     * then returns that list back
     * The algorithm assumes that there are at least n nodes
     * in the list
     */
    public static LinkedList solution(LinkedList list, int n) {
        Node fast = list.head();
        Node slow = list.head();
        for(int i = 0; i < n; i++) {
            fast = fast.next();  // increment the first pointer n times
        }
        // run a loop until the pointer 'fast' points to the last element
        while(fast.next() != null) {
            fast = fast.next();
            slow = slow.next();
        }

        // remove the element pointed to by the pointer 'slow'
        // which is n nodes behind the pointer 'fast'
        list.remove(slow);
        return list;
    }

}
