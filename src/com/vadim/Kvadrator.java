package com.vadim;

/**
 * Created by vadim on 07.04.2017.
 */
public class Kvadrator extends Calculator{

    Kvadrator(int n, Semafore sem) {
        super(n, sem);
    }

    @Override
    long getResult(int n) {
        return n * n;
    }

    @Override
    void sendResult(long result) {
        Consumer.getResult(0, result, 0);
    }
}
