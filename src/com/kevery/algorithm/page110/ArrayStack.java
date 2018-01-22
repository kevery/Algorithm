package com.kevery.algorithm.page110;

import java.util.EmptyStackException;

public class ArrayStack<E> {

    private Object[] items;

    private int top;

    public static final int INIT_SIZE = 100;

    public ArrayStack() {
        items = new Object[INIT_SIZE];
        top = -1;
    }

    public ArrayStack(int initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException();
        }

        items = new Object[initSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }

    public void push(E obj) {
        if (isFull()) {
            Object[] temp = items;
            items = new Object[items.length * 2];
            System.arraycopy(temp, 0, items, 0, temp.length);
        }
        items[++top] = obj;
    }

    public E peek() {
        if (!isEmpty()) {
            return (E) items[top];
        }
        return null;
    }

    public E pop() {
        if (!isEmpty()) {
            E temp = peek();
            items[top--] = null;
            return temp;

        }
        return null;
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();

        arrayStack.push("a");
        arrayStack.push("b");
        arrayStack.push("c");


        String pop1 = arrayStack.pop().toString();
        String pop2 = arrayStack.pop().toString();
        String pop3 = arrayStack.pop().toString();
    }
}
