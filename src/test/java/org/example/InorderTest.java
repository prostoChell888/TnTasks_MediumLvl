package org.example;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InorderTest {

    @Test
    void getListFomTreeGivenTreeReturnList() {
        /*

            1
           / \
          2   3
         / \
        4   5
 */


        Node root = new Node(1);
        root.setLeft(new Node(2));
        root.setRight(new Node(3));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));
        List<Integer> expectedList = List.of(4, 2, 5, 1, 3);

        List<Integer> resultList = Inorder.getListFomTree(root);

        assertEquals(expectedList, resultList);
    }

    @Test
    void getListFomTreeGivenNullTreeReturnEmptyList() {
        Node root = null;
        List<Integer> expectedList = new LinkedList<>();

        List<Integer> resultList = Inorder.getListFomTree(root);

        assertEquals(expectedList, resultList);
    }
}