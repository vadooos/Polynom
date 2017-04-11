package com.vadim;

/**
 * Created by vadim on 11.04.2017.
 */
public abstract class Calculator implements Runnable{
    private Thread t = new Thread(this);
    private Semafore sem;
    private int n;

    Calculator(int n, Semafore sem){
        this.n = n;
        this.sem = sem;
        t.start();
    }

    @Override
    public void run() {
        try {
            sem.acquire();
            sendResult(getResult(n));
            sem.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    abstract long getResult(int n);
    abstract void sendResult(long result);
}
