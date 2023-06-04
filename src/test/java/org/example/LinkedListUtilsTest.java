package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListUtilsTest {

    @ParameterizedTest
    @MethodSource("testData")
    void reverseLinkedList_shouldReverseList(Node head, Node expectedReversedHead) {
        Node reversedHead = LinkedListUtils.reverseLinkedList(head);
        assertLinkedListEquals(expectedReversedHead, reversedHead);
    }

    private static void assertLinkedListEquals(Node expected, Node actual) {
        if (expected == null) {
            assertNull(actual);
        } else {
            while (expected != null) {
                assertEquals(expected.value, actual.value);
                expected = expected.next;
                actual = actual.next;
            }
            assertNull(actual);
        }
    }

    private static Node createLinkedList(int... values) {
        if (values.length == 0) {
            return null;
        }

        Node head = new Node();
        head.value = values[0];
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            Node newNode = new Node();
            newNode.value = values[i];
            current.next = newNode;
            current = newNode;
        }

        return head;
    }

    private static Object[][] testData() {
        return new Object[][]{
//                {createLinkedList(), null}, // Empty list
//                {createLinkedList(1), createLinkedList(1)}, // Single node
//                {createLinkedList(1, 2), createLinkedList(2, 1)}, // Two nodes
                {createLinkedList(1, 2, 3), createLinkedList(3, 2, 1)}, // Three nodes
                {createLinkedList(1, 2, 3, 4, 5), createLinkedList(5, 4, 3, 2, 1)}, // Five nodes
        };
    }
}