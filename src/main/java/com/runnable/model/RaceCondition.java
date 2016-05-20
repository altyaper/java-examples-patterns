package com.runnable.model;

/**
 * Created by echavez on 5/19/16.
 */
class RaceCondition {

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
            threads[i].start();
        }
        for(int i = 0; i < threads.length; i++) {
            threads[i].join();
        }



        System.out.println("Value = "+ longWrapper.getValue());
    }

}
