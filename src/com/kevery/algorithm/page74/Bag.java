package com.kevery.algorithm.page74;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * Created by kever
 * 2016/10/1.
 */
public class Bag<Item> implements Iterable<Item>{

    public Bag() {
    }

    public void add(Item item) {

    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }


    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }
}
