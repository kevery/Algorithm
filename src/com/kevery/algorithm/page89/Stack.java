package com.kevery.algorithm.page89;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 下压栈链表实现
 * Created by kever
 * 2016/10/2.
 */
public class Stack<Item> implements Iterable {
    private Node first;
    private int n;

    public Stack() {
        first = null;
        n = 0;
    }

    public Stack(Stack<Item> s) {
        Stack<Item> temp = new Stack<>();
        if (s.isEmpty()) {
            temp.first = null;
            temp.n = 0;
        }else {
            first = new Node(s.first);
            for (Node x=first;x.next!=null;x=x.next) {
                x.next = new Node(x.next);
            }
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private class Node {
        Item item;
        Node next;

        public Node() {
        }

        public Node(Node x) {
            item = x.item;
            if (x.next!=null) {
                next = new Node(x.next);
            }
        }
    }

    /**
     * 是否为空
     */
    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    public Item pop() {
        Node oldFirst = first;
        first = first.next;
        n--;
        return oldFirst.item;


    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("stack underFlow");
        }
        return first.item;
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("name1");
        stack.push("name2");
        stack.push("name3");
        stack.push("name4");
        stack.push("name5");
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            System.out.println(1);
        }
        System.out.println(111);
        System.out.println("bug");
    }


}

