package org.example;


import java.util.LinkedList;
import java.util.List;


/**
 * object containing a method that traverses the tree and returns a list
 */
public class Preorder {

    /**
     * Implements a direct (preorder) traversal of the tree in depth
     * @param root node
     * @return list with tree int values
     */
    public List<Integer> getListFomTree(Node root) {
        List<Integer> listOfInt = new LinkedList<>();
        if (root == null) return listOfInt;

        preorderTraversal(listOfInt, root.getLeft());
        preorderTraversal(listOfInt, root.getRight());

        return listOfInt;
    }


    private void preorderTraversal(List<Integer> listOfInt, Node node) {
        if (node == null) return;
        listOfInt.add(node.getValue());

        preorderTraversal(listOfInt, node.getLeft());
        preorderTraversal(listOfInt, node.getRight());
    }
}