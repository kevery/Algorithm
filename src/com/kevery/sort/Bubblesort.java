package com.kevery.sort;

import com.kevery.Const;

import java.util.Arrays;

/**
 * 冒泡排序
 * Created by kever
 * 2018/2/19.
 */
public class Bubblesort {
    public static int[] sort(int[] num) {
        int k = num.length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k - 1; j++) {
                if (num[j] > num[j + 1]) {
                    //交换
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
            k--;
        }
        return num;
    }

    public static int[] sort2(int[] num) {
        boolean swapped;
        int k = num.length;
        do {
            swapped=false;
            for (int j = 0; j < k-1; j++) {
                if (num[j] > num[j + 1]) {
                    //交换
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swapped = true;
                }
            }
            k--;
        } while (swapped);
        return num;
    }


    public static void main(String[] args) {
        int[] sort = sort2(Const.numstr);
        System.out.println(Arrays.asList(sort));
    }
}
