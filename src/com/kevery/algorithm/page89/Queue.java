package com.kevery.algorithm.page89;

import java.util.Iterator;

/**
 * 队列链表实现
 * Created by kever
 * 2016/10/2.
 */
public class Queue<Item> implements Iterable{
    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item> {
        private Node currentNode = first;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Item next() {
            Item item = currentNode.item;
            currentNode = currentNode.next;
            return item;
        }
    }

    private class Node {
        private Item item;
        private Node next;
    }

    private Node first;
    private Node last;
    private int count;

    /**
     * 是否为空
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * 大小
     */
    public int size() {
        return count;
    }

    /**
     * 入列
     */
    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        count++;
    }

    /**
     * 出列
     */
    public Item dequeue() {
        if (isEmpty()) {
            return null;
        }
        Item item = first.item;
        first = first.next;
        count--;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }


    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("name1");
        queue.enqueue("name2");
        queue.enqueue("name3");
        queue.enqueue("name4");
        queue.enqueue("name5");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
