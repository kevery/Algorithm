package com.kevery.algorithm.s1_4;

/**
 * Created by Administrator on 2017/2/5 0005.
 */
public class BST<Key extends Comparable<Key>, Value> {
    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int count;//以该节点为根节点的子树中的总节点数

        public Node(Key key, Value value, int count) {
            this.key = key;
            this.value = value;
            this.count = count;
        }
    }

    private Node root;

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.count;
        }
    }

    //取值
    public Value get(Key key) {
        return get(root, key);
    }

    public Value get(Node node, Key key) {

        if (node == null) {
            return null;
        }
        Key nodeKey = node.key;
        int i = key.compareTo(nodeKey);
        if (i > 0) {
            return get(node.right, key);
        } else if (i < 0) {
            return get(node.left, key);
        } else {
            return node.value;
        }
    }


    //新增
    public void put(Key key, Value value) {
        put(root, key, value);
    }

    private Node put(Node node, Key key, Value value) {
        if (node == null) {
            return new Node(key, value, 1);
        }
        int i = key.compareTo(node.key);
        if (i > 0) {
            node.right = put(node.right, key, value);
        } else if (i < 0) {
            node.left = put(node.left, key, value);
        } else {
            node.value = value;
        }
        node.count = size(node.left) + size(node.right);
        return node;
    }


}
