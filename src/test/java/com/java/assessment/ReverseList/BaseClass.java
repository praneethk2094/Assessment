package com.java.assessment.ReverseList;

import org.junit.BeforeClass;
import org.junit.Ignore;

/*Base class containing helper methods for the tests*/
@Ignore
public class BaseClass {
    protected static ReverseList reverseList;

    @BeforeClass
    public static void init() {
        reverseList = new ReverseList();
    }

    /* Helper Method that prints the input list
      * @param {Node} head
      */
    protected void printNode(Node head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    /* Helper Method that checks if input list has loop
      * @param {Node} first
      * @return {boolean}
      */
    protected boolean loopChecker(Node first) {
        Node slow, fast;
        slow = fast = first;
        while (true) {
            if (fast.next.next != null || slow.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            } else {
                return false;
            }
            if (slow == null || fast == null || fast.next == null) {
                return false;
            }
            if (slow == fast || fast.next == slow) {
                return true;
            }
        }
    }

    /* Helper Method that generates a list with input array
      * @param {int[]} values
      * @return {Node}
      */
    protected Node listGenerator(int[] values) {
        Node prev = new Node();
        Node head = prev;
        for (int value : values) {
            Node n = new Node();
            n.value = value;
            prev.next = n;
            prev = prev.next;
        }
        head = head.next;
        return head;
    }

    /* Helper Method that returns the length of the input list
     * @param {Node} head
     * @return {int}
     */
    protected int getLength(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
