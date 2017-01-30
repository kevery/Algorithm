package com.kevery.algorithm.s1_4;

/**
 * 练习
 * Created by kever
 * 2017/1/30.
 */
public class VideoTest {
    public int binarySearch(int[] items, int target) {
        int left=0;
        int right=items.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target < items[mid]) {
                right = mid - 1;
            }else if(target>items[mid]){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        VideoTest videoTest = new VideoTest();
        int[] items={4, 8, 9, 9,45,89,120};
        int i = videoTest.binarySearch(items, 8);
        System.out.println(i);

    }
}
