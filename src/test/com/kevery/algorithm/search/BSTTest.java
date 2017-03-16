package com.kevery.algorithm.search;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class BSTTest {
    @Test
    public void name() throws Exception {
        BST<Integer, String> bst = new BST<>();
        bst.put(1, "1");
        bst.put(7, "7");
        bst.put(3, "3");
        bst.put(6, "6");
        bst.put(9, "9");
        bst.put(0, "0");
        System.out.println(bst);
        System.out.println(bst.floor(8));
    }


    public Integer test1(Integer integer) throws Exception {
        if (integer == 0) {
            return null;
        }
        return test1(integer - 1);


    }

    @Test
    public void name1() throws Exception {
        Integer integer = test1(2);
        System.out.println(integer);

    }
}