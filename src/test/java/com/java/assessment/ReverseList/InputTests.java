package com.java.assessment.ReverseList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

public class InputTests extends BaseClass {

    /*Test to check null -> null*/
    @Test
    public void testNull() {
        assertNull("Fail-The returned object is not Null", reverseList.reverseList(null));
    }

    /*Test to check 1->null => 1->null*/
    @Test
    public void testSingleElement() {
        Node n = new Node();
        assertNotNull(reverseList.reverseList(n));
        n.value = 1;
        assertEquals("One Element Test", 1, reverseList.reverseList(n).value);
    }

    /*Test to check output length is same as input*/
    @Test
    public void testLengthReturnedIsSame() {
        Node head = listGenerator(new int[]{1, 2, 3, 4, 5, 6});
        assertEquals("Length Test Fail", getLength(head), getLength(reverseList.reverseList(head)));
    }

    /*Test to check output is reversed*/
    @Test
    public void testIfReversed() {
        Node head = listGenerator(new int[]{1, 2, 3, 4});
        List<Integer> expected = Arrays.asList(4, 3, 2, 1);
        List<Integer> actual = new ArrayList<>();
        Node n = reverseList.reverseList(head);
        while (n != null) {
            actual.add(n.value);
            n = n.next;
        }
        assertEquals(expected, actual);
    }

    /*Test to check method can handle negative inputs*/
    @Test
    public void testNegativeInputs() {
        Node head = listGenerator(new int[]{-1, 1, 2, -3, 4});
        List<Integer> expected = Arrays.asList(4, -3, 2, 1, -1);
        List<Integer> actual = new ArrayList<>();
        Node n = reverseList.reverseList(head);
        while (n != null) {
            actual.add(n.value);
            n = n.next;
        }
        assertEquals(expected, actual);
    }

    /*Test to check large number of inputs returns expected output*/
    @Test
    public void testLargeNumberOfInputs() {
        Stack<Integer> stack = new Stack<>();
        List<Integer> actual = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        Node temp = new Node();
        Node head = temp;
        for (int i = 0; i < 1000; i++) {
            Node n = new Node();
            n.value = i;
            stack.push(i);
            temp.next = n;
            temp = temp.next;
        }
        head = head.next;
        while (!stack.isEmpty()) {
            expected.add(stack.pop());
        }
        Node n = reverseList.reverseList(head);
        while (n != null) {
            actual.add(n.value);
            n = n.next;
        }
        assertEquals("Expected and Received not same", expected, actual);
    }

    /*Test to check method can handle Max and Min values*/
    @Test
    public void testMinMaxIntegerInput() {
        Node head = listGenerator(new int[]{Integer.MIN_VALUE, 1, Integer.MAX_VALUE, 2, 2, 1});
        List<Integer> expected = Arrays.asList(2, Integer.MAX_VALUE, 1, Integer.MIN_VALUE);
        Node n = reverseList.reverseList(head);
        List<Integer> actual = new ArrayList<>();
        while (n != null) {
            actual.add(n.value);
            n = n.next;
        }
        assertEquals(expected, actual);
    }

    /*Test to check duplicate inputs returns non duplicated reversed output*/
    @Test
    public void testDuplicateInputsReturnsUnDuplicatedList() {
        Node head = listGenerator(new int[]{1, 1, 2, 2, 1});
        List<Integer> expected = Arrays.asList(2, 1);
        Node n = reverseList.reverseList(head);
        List<Integer> actual = new ArrayList<>();
        while (n != null) {
            actual.add(n.value);
            n = n.next;
        }
        assertEquals(expected, actual);
    }

    /*Test to check odd number of inputs return expected result*/
    @Test
    public void testOddNumberOfInputs() {
        Node head = listGenerator(new int[]{1, 2, 3});
        List<Integer> expected = Arrays.asList(3, 2, 1);
        Node n = reverseList.reverseList(head);
        List<Integer> actual = new ArrayList<>();
        while (n != null) {
            actual.add(n.value);
            n = n.next;
        }
        assertEquals(expected, actual);
    }

    /*Test to check even number of inputs return expected result*/
    @Test
    public void testEvenNumberOfInputs() {
        Node head = listGenerator(new int[]{1, 2, 3, 4});
        List<Integer> expected = Arrays.asList(4, 3, 2, 1);
        Node n = reverseList.reverseList(head);
        List<Integer> actual = new ArrayList<>();
        while (n != null) {
            actual.add(n.value);
            n = n.next;
        }
        assertEquals(expected, actual);
    }

}
