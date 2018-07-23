package com.wicht.concurrency.s1;

public class MySecondRunnable implements Runnable{
    @Override
    public void run() {
        System.out.printf("I'm running in thread %s \n", Thread.currentThread().getName());
    }
}