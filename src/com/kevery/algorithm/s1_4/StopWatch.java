package com.kevery.algorithm.s1_4;

/**
 * 计时器
 * Created by kever
 * 2016/10/2.
 */
public class StopWatch {
    private final long start;

    public StopWatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start)/1000.0;
    }

    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        Thread.sleep(4699);
        System.out.println(1);
        double time = stopWatch.elapsedTime();
        System.out.println(time);
        System.out.println("dev");
        System.out.println("dev12");
        System.out.println("dev");
    }

    public void test(){

    }
}
