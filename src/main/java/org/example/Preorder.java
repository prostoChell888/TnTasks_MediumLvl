package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;



/**
 * object containing a method that traverses the tree and returns a list
 */
public class Preorder {

    /**
     * Implements a direct (preorder) traversal of the tree in depth
     *
     * @param root node
     * @return list with tree int values
     */
    public static List<Integer> getListFomTree(Node root) {
        if (root == null) return new LinkedList<>();

        Deque<Node> stack = new LinkedList<>();
        stack.push(root);

        List<Integer> res = new LinkedList<>();
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            res.add(node.getValue());

            if (node.getRight() != null)
                stack.push(node.getRight());

            if (node.getLeft() != null)
                stack.push(node.getLeft());
        }

        return res;
    }
}