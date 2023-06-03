package com.example.simpleRESTQuoteApi.thread;

import java.time.LocalTime;

public class threadDemo extends Thread{

    @Override
    public void run() {
//        System.out.println("This is a thread");

        long startTime = System.nanoTime();
        for(int i =0; i< 1000; i++){
            System.out.println(i);
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("elapsed time in mili sec " + totalTime/1000000);
    }
}
