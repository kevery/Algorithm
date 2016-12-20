package com.kevery.algorithm.page156;


import java.io.FileNotFoundException;

/**
 * 选择排序
 * Created by kever
 * 2016/10/3.
 */
public class Selection {
    private static void sort(Comparable[] comparables) {
        int n = comparables.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (less(comparables[j], comparables[min])) {
                    min = j;
                }
            }
            exch(comparables,min,i);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] comparables) {
        for (int i = 0; i < comparables.length; i++) {
            System.out.print(comparables[i] + " ");
        }
    }

    public static boolean isSorted(Comparable[] comparables) {
        for (int i = 1; i < comparables.length; i++) {
            if (less(comparables[i], comparables[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Integer[] integers = {5, 7, 2, 29, 0, 49,4};
        Insertion.sort(integers);
        System.out.println(Insertion.isSorted(integers));
        Insertion.show(integers);
    }
}
