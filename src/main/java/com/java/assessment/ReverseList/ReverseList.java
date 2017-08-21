package com.java.assessment.ReverseList;

public class ReverseList {

    /**
     * Method to reverse the input list
     *
     * @param {Node} head- first element of a list
     * @return {Node}
     */
    public Node reverseList(Node head) {
        Node first;
        if (head == null || head.next == null) {
            return head;
        } else {
            first = removeDuplicates(loopStraightener(head));
        }
        Node prev = null;
        Node current = first;
        Node next;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
        return first;
    }

    /**
     * Helper Method to check and remove duplicates
     *
     * @param {Node} head- first element of a list
     * @return {Node}
     */
    private Node removeDuplicates(Node head) {

        Node current = head;
        Node runner;

        while (current != null && current.next != null) {
            runner = current;
            while (runner.next != null) {
                if (current.value != runner.next.value) {
                    runner = runner.next;
                } else {
                    runner.next = runner.next.next;
                }
            }
            current = current.next;
        }
        return head;
    }

    /**
     * Helper Method to check for Loops and remove them
     *
     * @param {Node} first- first element of a list
     * @return {Node}
     */
    private Node loopStraightener(Node first) {
        Node slow, fast, start;
        slow = fast = first;
        while (true) {
            if (fast.next.next != null || slow.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            } else {
                return first;
            }
            if (slow == null || fast == null || fast.next == null) {
                return first;
            }
            if (slow == fast) {
                break;
            }
        }
        fast = first;
        while (fast.next != slow.next) {
            fast = fast.next;
            slow = slow.next;
        }
        start = fast.next;

        fast = start;
        while (fast.next != start) {
            fast = fast.next;
        }
        fast.next = null;
        return first;
    }


}

/**
 * Node class
 */
class Node {
    Node next;
    int value;
}
