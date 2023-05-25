package org.example;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BreadthFirstTraversalTest {

    @Test
    void getListFomTreeGivenTreeReturnList() {
        // Create the tree
        Node root = new Node(1);
        root.setLeft(new Node(2));
        root.setRight(new Node(3));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));
        List<Integer> expectedList = List.of(1, 2, 3, 4, 5);

        List<Integer> resultList = BreadthFirstTraversal.getListFomTree(root);

        assertEquals(expectedList, resultList);
    }

    @Test
    void getListFomTreeGivenNullTreeReturnEmptyList() {
        Node root = null;
        List<Integer> expectedList = new LinkedList<>();

        List<Integer> resultList = BreadthFirstTraversal.getListFomTree(root);

        assertEquals(expectedList, resultList);
    }
}