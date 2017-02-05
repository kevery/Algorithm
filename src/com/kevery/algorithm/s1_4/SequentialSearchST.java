package com.kevery.algorithm.s1_4;

/**
 * Created by Administrator on 2017/2/2 0002.
 */
public class SequentialSearchST<Key, Value> {
    private Node first;

    private class Node {
        Key key;
        Value value;
        Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                return x.value;
            }
        }
        return null;
    }
    public void put(Key key,Value value){
        //查找给定的键，存在则更新值，否则新增节点
        for (Node x=first;x!=null;x=x.next) {
            if(key.equals(x.key)){
                x.value=value;
                return;
            }
        }
        first = new Node(key, value, first);//未命中开头新建节点
    }

    public int size(){
        int i=0;
        for (Node x=first;x!=null;x=x.next) {
            i++;
        }
        return i;
    }
    public void delete(Key key){
        for (Node x=first;x!=null;x=x.next) {
            if(x.key.equals(key)){
                //命中
                x.value = null;
            }
        }
    }

    public static void main(String[] args) {
        SequentialSearchST sequentialSearchST = new SequentialSearchST();
        sequentialSearchST.put("a", 1);
        sequentialSearchST.put("b",2);
        sequentialSearchST.put("c",3);
        int size = sequentialSearchST.size();
        sequentialSearchST.delete("b");
        int size1 = sequentialSearchST.size();

        System.out.println(sequentialSearchST);
    }


}

