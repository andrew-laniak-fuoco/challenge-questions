package ca.jrvs.challenge.linkedList;

public class ReverseOrder {

    /**
     * (MOCK)
     * Reverses the order of a given singly linked list
     */
    public static LinkedList solution(LinkedList list) {
        Node prev = null;
        Node curr = list.head();
        Node next = curr.next();

        // loop until we hit the end of the list
        while(curr != null) {
            curr.setNext(prev); // reverse link for the current element
            // increment each Node to the next in the list based on the original order
            prev = curr;
            curr = next;
            next = curr.next();
        }
        // return prev, which will be the new head Node
        // both curr and next will be null by the end of the loop
        return prev;
    }
}
