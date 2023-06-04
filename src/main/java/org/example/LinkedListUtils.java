package org.example;

public class LinkedListUtils {

    /**
     * reverse linked list
     * @param head head of linked list
     * @return new head of linked list
     */
    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}