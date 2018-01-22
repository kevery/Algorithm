package com.kevery.algorithm.page74;


import java.util.EmptyStackException;

/**
 * 栈 数组实现
 */
public class StackArray {

    //声明数组
    private Object[] itemArray;

    //数组顶部指针
    private int top;

    //当前大小
    private static final int size = 100;


    /**
     * 入栈
     */
    public void push(Object item) {
        if (top == 100 - 1) {
            throw new StackOverflowError();
        }else{
            itemArray[++top] = item;
        }
    }

    /**
     * 出栈
     */
    public Object pop() {
        if (top == 0) {
            throw new EmptyStackException();
        }
        return itemArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
