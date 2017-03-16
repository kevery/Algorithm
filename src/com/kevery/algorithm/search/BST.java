package com.kevery.algorithm.search;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public class BST<Key extends Comparable<Key>, Value> {

    private Node root;

    private class Node {

        public Node(Key key, Value value, int n) {
            this.key = key;
            this.value = value;
            N = n;
        }

        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int N;
    }

    private int size() {
        return size(root);
    }

    private int size(Node node) {
        if (root == null) {
            return 0;
        } else {
            return node.N;
        }
    }


    public Value get(Key key) {
        return null;
    }

    public Value get(Node node, Key key) {
        if (node == null) {
            return null;
        }

        if (node.key.compareTo(key) > 0) {
            return get(node.right, key);
        } else if (node.key.compareTo(key) < 0) {//小于
            return get(node.left, key);
        } else {
            return node.value;
        }
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }


    public Node put(Node node, Key key, Value value) {
        if (node == null) {
            return new Node(key, value, 1);
        }
        int compareTo = key.compareTo(node.key);//大小标示
        if (compareTo > 0) {
            node.right = put(node.right, key, value);
        } else if (compareTo < 0) {
            node.left = put(node.left, key, value);
        } else {
            node.value = value;
        }
        node.N = size(node.left) + size(node.right) + 1;
        return node;

    }

}
