package org.example;

import java.util.*;

public class Inorder {
    /**
     * Implements a inorder traversal of the tree in depth
     *
     * @param root node
     * @return list with tree int values
     */
    public static List<Integer> getListFomTree(Node root) {
        List<Integer> resList = new ArrayList<>();
        if (root == null) return resList;

        Deque<Node> nodeStack = new ArrayDeque<>();
        Deque<Integer> valueStack = new ArrayDeque<>();
        nodeStack.add(root);

        Node currentNode;
        while (!nodeStack.isEmpty()) {
            currentNode = nodeStack.pollFirst();
            valueStack.addFirst(currentNode.getValue());

            if (currentNode.getLeft() == null) resList.add(valueStack.pollFirst());
            if (currentNode.getRight() == null && !valueStack.isEmpty()) resList.add(valueStack.pollFirst());

            if (currentNode.getRight() != null) nodeStack.addFirst(currentNode.getRight());
            if (currentNode.getLeft() != null) nodeStack.addFirst(currentNode.getLeft());
        }

        return resList;
    }
}