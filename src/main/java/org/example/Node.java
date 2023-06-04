package org.example;

class Node {
    public Node(Node next, int value) {
        this.next = next;
        this.value = value;
    }

    public Node next;
    public int value;
}