package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.setLeft(new Node(2));
        root.setRight(new Node(3));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));

        List<Integer> bfsList = BreadthFirstTraversal.getListFomTree(root);
        System.out.println("Breadth-first traversal result: " + bfsList);
    }
}
