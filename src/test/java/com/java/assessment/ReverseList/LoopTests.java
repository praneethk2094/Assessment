package com.java.assessment.ReverseList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;

public class LoopTests extends BaseClass {

    /*Test to check method returns list with no loops*/
    @Test
    public void testLoop() {
        Node head = listGenerator(new int[]{1, 2, 3, 4, 5, 6});
        assertFalse("Loop exists", loopChecker(head));
    }

    /*Test to check looped input returns un looped, reversed list*/
    @Test
    public void testLoopedInputReturnsUnLoopedReversed() {
        Node a = new Node();
        a.value = 1;
        Node b = new Node();
        b.value = 2;
        Node c = new Node();
        c.value = 3;
        Node d = new Node();
        d.value = 4;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        List<Integer> expected = Arrays.asList(4, 3, 2, 1);
        List<Integer> actual = new ArrayList<>();
        Node n = reverseList.reverseList(a);
        while (n != null) {
            actual.add(n.value);
            n = n.next;
        }
        assertEquals(expected, actual);

    }
}
