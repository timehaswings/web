package com.ignite.video;

import java.util.concurrent.Callable;

public class TaskTest implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("---thread start---");
        int i = 0;
        for(;i<100;i++){
            Thread.sleep(10);
        }
        System.out.println("---thread end---");
        return i;
    }
}
