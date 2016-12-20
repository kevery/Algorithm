package com.kevery.algorithm.page89;

/**
 * 1.3.14
 * Created by kever
 * 2016/10/2.
 */
public class ResizingArrayQueueStrings<Item> {
    private Item[] items;
    private int count;
    private int first;
    private int last;

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    /**
     * 入列
     *
     * @param item
     */
    public void enQueue(Item item) {
        if (items.length == count) {
            resize(2 * items.length);
        }
        items[last++] = item;
        if (items.length == last) {
            last = 0;
        }
        count++;
    }

    public Item deQueue() {
        Item temp = items[first++];
        items[first] = null;
        count--;
        if (items.length == first) {
            first = 0;
        }
        if (count < items.length / 4) {
            resize(items.length / 2);
        }
        return temp;
    }

    public void resize(int capacity) {
        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        items = temp;
        first = 0;
        last = count;
    }
}
