package com.vadim;

/**
 * Created by vadim on 07.04.2017.
 */
public class Cubator extends Calculator{

    Cubator(int n, Semafore sem) {
        super(n, sem);
    }

    @Override
    long getResult(int n) {
        return n * n * n;
    }

    @Override
    void sendResult(long result) {
        Consumer.getResult(result, 0, 0);
    }

}
