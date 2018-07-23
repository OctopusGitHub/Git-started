package com.wicht.concurrency.s1;

public class MultipleThread {
    public static void main(String[] args) {
        Runnable runnable = new MyFirstRunnable();

        for(int i = 0; i < 25; i++){
            new Thread(runnable).start();
        }
    }
}