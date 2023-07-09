package org.example;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println("Original linked list:");
        printLinkedList(head);

        Node reversedHead = LinkedListUtils.reverseLinkedList(head);

        System.out.println("Reversed linked list:");
        printLinkedList(reversedHead);
    }

    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
