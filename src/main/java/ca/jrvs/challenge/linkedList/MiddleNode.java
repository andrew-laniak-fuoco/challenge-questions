package ca.jrvs.challenge.linkedList;

public class MiddleNode {

    /**
     * (MOCK)
     * Returns the middle node from a given linked list
     */
    public static Node solution(LinkedList list) {
        Node fast = list.head();
        Node slow = list.head();
        Node prev;

        // run a loop until the pointer 'fast' points to the last node of the list
        // or if the pointer has gone past the tail
        while(fast != null || fast.next() != null) {
            fast = fast.next();
            fast = fast.next();
            prev = slow;
            slow = slow.next();
        }
        // we return prev as slow will point to the element just past the middle point
        return prev;
    }
}
