package classes.binaryTree;

import lombok.Data;

public class BinarySearchTree {
    private TreeNode root;
    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(int value){
        this.root = insertRecursive(this.root, value);
    }

    private TreeNode insertRecursive(TreeNode current, int value){
        if(current == null){
            return new TreeNode(value);
        }
        if (value < current.value){
            current.left = insertRecursive(current.left, value);
        }
        else if (value> current.value){
            current.right = insertRecursive(current.right, value);
        }
        return current;
    }

    public boolean search(int value){
        return searchRecursive(this.root, value);
    }

    private boolean searchRecursive(TreeNode current, int value){
        if (current == null){
            return false;
        }
        if (value == current.value){
            return true;
        }
        if (value < current.value){
            return searchRecursive(current.left, value);
        }
        return searchRecursive(current.right, value);
    }
}
