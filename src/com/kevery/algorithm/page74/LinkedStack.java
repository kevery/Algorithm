package com.kevery.algorithm.page74;

import java.util.EmptyStackException;

/**
 * 栈链表实现
 */
public class LinkedStack<T> implements Stack<T> {

    //栈顶指针
    private Node<T> top;

    private int elementCount;

    public LinkedStack() {
        this.elementCount = 0;
        top = new Node<>();
    }

    private class Node<U> {
        private U item;
        private Node<U> next;

        Node() {
            this.item = null;
            this.next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }


    }


    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T result = top.item;

        if (!top.end()) {
            top = top.next;
        }
        elementCount--;
        return result;
    }

    @Override
    public void push(T element) {
        top = new Node<>(element, top);
        elementCount++;

    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.item;
    }

    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<>();

        linkedStack.push("item1");
        linkedStack.push("item2");
        linkedStack.push("item3");
        linkedStack.push("item4");


        String pop = linkedStack.pop();
        String pop1 = linkedStack.pop();

        System.out.println("");
    }
}
