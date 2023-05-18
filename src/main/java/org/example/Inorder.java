package org.example;

import java.util.LinkedList;
import java.util.List;

public class Inorder {

    /**
     * Implements a inorder traversal of the tree in depth
     * @param root node
     * @return list with tree int values
     */
    public static List<Integer> getListFomTree(Node root) {
        List<Integer> listOfInt = new LinkedList<>();
        if (root == null) return listOfInt;

        preorderTraversal(listOfInt, root.getLeft());
        listOfInt.add(root.getValue());
        preorderTraversal(listOfInt, root.getRight());

        return listOfInt;
    }


    private static void preorderTraversal(List<Integer> listOfInt, Node node) {
        if (node == null) return;

        preorderTraversal(listOfInt, node.getLeft());
        listOfInt.add(node.getValue());
        preorderTraversal(listOfInt, node.getRight());
    }
}