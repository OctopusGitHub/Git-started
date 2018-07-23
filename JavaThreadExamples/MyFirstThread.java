package com.wicht.concurrency.s1;

public class MyFirstThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyFirstRunnable());
        thread.start();
        System.out.println("In the main Thread");
    }
}