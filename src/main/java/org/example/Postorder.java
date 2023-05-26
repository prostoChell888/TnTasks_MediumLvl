package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Postorder {

    /**
     * Implements a postorder traversal of the tree in depth
     *
     * @param root node
     * @return list with tree int values
     */
    public static List<Integer> getListFomTree(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        Node prev = null;
        while (!stack.isEmpty()) {
            Node current = stack.peek();
            if (current.getLeft() == null && current.getRight() == null ||
                    (prev != null && (prev == current.getLeft() || prev == current.getRight()))) {
                result.add(current.getValue());
                stack.pop();
                prev = current;
            } else {
                if (current.getRight() != null) {
                    stack.push(current.getRight());
                }
                if (current.getLeft() != null) {
                    stack.push(current.getLeft());
                }
            }
        }

        return result;
    }


    private static void preorderTraversal(List<Integer> listOfInt, Node node) {
        if (node == null) return;

        preorderTraversal(listOfInt, node.getLeft());
        preorderTraversal(listOfInt, node.getRight());

        listOfInt.add(node.getValue());
    }
}