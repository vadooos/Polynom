package com.vadim;

/**
 * Created by vadim on 07.04.2017.
 */
public class Consumer {
    private static long sumCube = 0;
    private static long sumSquare = 0;
    private static long sumSimple = 0;
    private static long sumPolynom = 0;

    public static synchronized void getResult(long cube, long square, long simple){
        sumCube += cube;
        sumSquare += square;
        sumSimple += simple;
        sumPolynom = sumCube + sumSquare + sumSimple;
        System.out.printf("%d + %d + %d = %d\r\n", sumCube, sumSquare, sumSimple, sumPolynom);
    }
}
