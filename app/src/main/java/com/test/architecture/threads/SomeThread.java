package com.test.architecture.threads;

public class SomeThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("Привет из потока SomeThread");
    }
}
