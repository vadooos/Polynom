package com.vadim;

/**
 * Created by vadim on 07.04.2017.
 */
public class Semafore {
    private volatile int permits = 1;

    public Semafore(int permits) {
        this.permits = permits;
    }

    public synchronized void acquire() throws InterruptedException {
        while (permits == 0)
            wait();
        permits--;
    }

    public synchronized void release(){
        permits++;
        notify();
    }
}
