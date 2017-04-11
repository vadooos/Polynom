package com.vadim;

/**
 * Created by vadim on 07.04.2017.
 */
public class Simpler extends Calculator{

    Simpler(int n, Semafore sem) {
        super(n, sem);
    }

    @Override
    long getResult(int n) {
        return n;
    }

    @Override
    void sendResult(long result) {
        Consumer.getResult(0, 0, result);
    }
}
