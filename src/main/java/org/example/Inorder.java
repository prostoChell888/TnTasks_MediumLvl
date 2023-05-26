package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Inorder {

    /**
     * Implements a inorder traversal of the tree in depth
     * @param root node
     * @return list with tree int values
     */
    public static List<Integer> getListFomTree(Node root) {
        if (root == null) return new LinkedList<>();

        Deque<Node> stack = new LinkedList<>();
        Node current = root;

        List<Integer> res = new LinkedList<>();
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }

            current = stack.pop();
            res.add(current.getValue());

            current = current.getRight();
        }

        return res;
    }
}