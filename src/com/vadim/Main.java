package com.vadim;

public class Main {
    static int[] arrForCube = {4,2,5,54,74,65,234,44,243,765,23,52};
    static int[] arrForSquare = {987,876,765,654,543,432,321};
    static int[] arrForSimple = {1234, 2345, 3456, 4567,5678};

    public static void main(String[] args) {
        Semafore semaforeCube = new Semafore(1);
        Semafore semaforeSquare = new Semafore(1);
        Semafore semaforeSimple = new Semafore(1);

        for (int i = 0; i < arrForCube.length; i++)
            new Cubator(arrForCube[i], semaforeCube);

        for (int i = 0; i < arrForSquare.length; i++)
            new Kvadrator(arrForSquare[i], semaforeSquare);

        for (int i = 0; i < arrForSimple.length; i++)
            new Simpler(arrForSimple[i], semaforeSimple);
    }
}
