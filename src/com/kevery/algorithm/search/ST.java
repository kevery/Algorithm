package com.kevery.algorithm.search;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public interface ST<Key,Value> {


    public void put(Key key, Value value);


    Value get(Key key);

    void delete(Key key);

    boolean contain(Key key);

    boolean isEmpty();

    int size();

    Iterable<Key> keys();

}
