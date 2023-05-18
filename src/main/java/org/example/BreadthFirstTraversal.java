package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * This class contain breadth-first traversal method
 */
public class BreadthFirstTraversal {

    /**
     * Implements a breadth-first traversal  of the tree in depth
     *
     * @param root node
     * @return list with tree int values
     */
    public static List<Integer> getListFomTree(Node root) {

        Queue<Node> queue = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            list.add(node.getValue());

            if (root.getLeft() != null) queue.offer(node.getLeft());
            if (root.getLeft() != null) queue.offer(root.getRight());

        }
        return list;
    }
}