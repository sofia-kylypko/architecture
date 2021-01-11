package com.test.architecture.threads;

public class SomeThing implements Runnable{

    @Override
    public void run() {
        System.out.println("Привет из потока SomeThing");
    }
}
