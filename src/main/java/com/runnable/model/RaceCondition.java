package com.runnable.model;

import java.util.Collections;
import java.util.Scanner;

/**
 * Created by echavez on 5/19/16.
 */
public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {

        final LongWrapper longWrapper = new LongWrapper(0);

        Runnable r = new Runnable() {
            public void run() {
                for(int i = 0; i < 1000; i++){
                    longWrapper.incrementValue();
                }
            }
        };

        Thread[] threads = new Thread[1000];
        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(r);
            //PRINT STATE
            System.out.println(threads[i].getState());
            threads[i].start();

        }
        for(int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println("Value = "+ longWrapper.getValue());
    }

}
