package org.example;

import java.util.*;

/**
 * This class contain breadth-first traversal method
 */
public class BreadthFirstTraversal {

    /**
     * Implements a breadth-first traversal  of the tree in widt
     *
     * @param root node
     * @return list with tree int values
     */
    public static List<Integer> getListFomTree(Node root) {
        if (root == null) return new ArrayList<>();

        Queue<Node> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            list.add(node.getValue());

            if (node.getLeft() != null) queue.offer(node.getLeft());
            if (node.getRight() != null) queue.offer(node.getRight());
        }

        return list;
    }
}