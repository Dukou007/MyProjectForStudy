package com.jettech.thread;

/**
 * @author : dukou_caiqin@163.com
 * @date: 2020/11/10  15:10
 * @description: 跟随诸葛老师学习Java多线程
 */
public class VolatileVisibilityTest {
    private static volatile boolean initFlag = false;

    public static void main(String[] args) throws InterruptedException {

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("wait data.....................");
                        while (!initFlag) {

                        }
                        System.out.println("------------>success<---------------------");
                    }


                }
        ).start();

        Thread.sleep(2000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                prepareData();
            }
        }).start();
    }

    private static void prepareData() {
        System.out.println("------->paraData start<--------------------");
        initFlag = true;
        System.out.println("---------------->paraData end<-------------------");
    }
}
