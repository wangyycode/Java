package com.wyy.thread;

public class ThreadStatus {

    public static void main(String[] args) {

        //Thread.State.NEW;

        Thread t1 = new Thread(){

            @Override
            public void run(){
                System.out.println("111");
            }

        };

        t1.start();


        Runnable runnable = null;


        MyThread mt = new MyThread();
        Thread t2 = new Thread(mt);
        t2.start();

    }


    static class MyThread implements Runnable {

        @Override
        public void run() {
            System.out.println("222");
        }

    }



}
