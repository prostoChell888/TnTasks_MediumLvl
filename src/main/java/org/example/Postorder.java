package org.example;

import java.util.LinkedList;
import java.util.List;

public class Postorder {

    /**
     * Implements a postorder traversal of the tree in depth
     * @param root node
     * @return list with tree int values
     */
    public static List<Integer> getListFomTree(Node root) {
        List<Integer> listOfInt = new LinkedList<>();
        if (root == null) return listOfInt;

        preorderTraversal(listOfInt, root.getLeft());
        preorderTraversal(listOfInt, root.getRight());

        listOfInt.add(root.getValue());

        return listOfInt;
    }


    private static void preorderTraversal(List<Integer> listOfInt, Node node) {
        if (node == null) return;

        preorderTraversal(listOfInt, node.getLeft());
        preorderTraversal(listOfInt, node.getRight());

        listOfInt.add(node.getValue());
    }
}