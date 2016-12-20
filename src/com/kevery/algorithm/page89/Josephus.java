package com.kevery.algorithm.page89;

/**
 * Josephus问题
 * Created by kever
 * 2016/10/2.
 */
public class Josephus {
    public static void main(String[] args) {
        int n=7;
        int m = 4;
        // initialize the queue
        Queue<Integer> queue = new Queue<Integer>();
        for (int i = 0; i < n; i++)
            queue.enqueue(i);

        while (!queue.isEmpty()) {
            //将第m人(座位号m-1)置于队列头
            for (int i = 0; i < m-1; i++){
                queue.enqueue(queue.dequeue());
            }
            //出列/杀死
            System.out.print(queue.dequeue() + "");
        }
        System.out.println();

    }
}
