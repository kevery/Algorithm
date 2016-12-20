package com.kevery.algorithm.page74;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 栈数组实现
 * Created by kever
 * 2016/10/1.
 */
public class StringOfStack<Item> implements Iterable<Item>{
    private Item[] sts;
    private int count;

    public StringOfStack(int cap) {
        sts = (Item[]) new Object[cap];
    }

    public void push(Item s) {
        if (sts.length == count) {
            reSize(2 * sts.length);
        }
        sts[count++] = s;
    }

    public Item pop() {
        Item item = sts[--count];
        sts[count] = null;
        if (count > 0 && count == sts.length / 4) {
            reSize(sts.length / 2);
        }
        return item;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * 数组扩容
     *
     * @param max
     */
    public void reSize(int max) {
        Item[] items = (Item[]) new Object[max];
        for (int i = 0; i < count; i++) {
            items[i] = sts[i];
        }
        sts = items;
    }

    public Item[] getSts() {
        return sts;
    }

    public void setSts(Item[] sts) {
        this.sts = sts;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverserArrayIterator();
    }

    private class ReverserArrayIterator implements Iterator<Item> {
        int i = -1;

        @Override
        public boolean hasNext() {
            return ++i < count;
        }

        @Override
        public Item next() {
            return sts[i];
        }
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }
}
