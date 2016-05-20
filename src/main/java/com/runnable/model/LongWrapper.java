package com.runnable.model;

/**
 * Created by echavez on 5/19/16.
 */
public class LongWrapper {

    private long l;
    private Object key = new Object();

    public LongWrapper(long l){
        this.l = l;
    }

    public long getValue(){
        return l;
    }

    public void incrementValue(){
        synchronized (key){
            l = l + 1;
        }
    }

}
