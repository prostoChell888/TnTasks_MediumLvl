package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.setLeft(new Node(2));
        root.setRight(new Node(3));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));

        List<Integer> postorderList = Postorder.getListFomTree(root);
        System.out.println("Postorder traversal result: " + postorderList);
    }
}
