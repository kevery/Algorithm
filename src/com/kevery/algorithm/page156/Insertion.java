package com.kevery.algorithm.page156;

/**
 * 插入排序
 * Created by kever
 * 2016/10/3.
 */
public class Insertion {
    public static void sort(Comparable[] comparable) {
        for (int i = 1; i < comparable.length; i++) {
            for (int k = i; k > 0; k--) {
                if (less(comparable[k], comparable[k - 1])) {
                    exch(comparable, k, k - 1);
                }
            }
        }
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void exch(Comparable[] comparables, int a, int b) {
        Comparable temp = comparables[a];
        comparables[a] = comparables[b];
        comparables[b] = temp;
    }

    public static boolean isSorted(Comparable[] comparables) {
        for (int i = 1; i < comparables.length; i++) {
            if (less(comparables[i], comparables[i-1])) {
            return false;
        }
    }
        return true;
}

    public static void show(Comparable[] comparables) {
        for (Comparable comparable : comparables) {
            System.out.print(comparable.toString()+" ");
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {5, 7, 2, 29, 0, 49};
        Insertion.sort(integers);
        System.out.println(Insertion.isSorted(integers));
        Insertion.show(integers);

    }

}
