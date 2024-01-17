package tasks;

import classes.binaryTree.BinarySearchTree;

public class Task_3_2 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(4);

        System.out.println(tree.search(3));
        System.out.println(tree.search(7));
    }
}
