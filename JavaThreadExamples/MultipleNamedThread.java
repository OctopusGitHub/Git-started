package com.wicht.concurrency.s1;

public class MultipleNamedThread {
    public static void main(String[] args) {
        Runnable runnable = new MySecondRunnable();

        for(int i = 0; i < 25; i++){
            Thread thread = new Thread(runnable);
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}