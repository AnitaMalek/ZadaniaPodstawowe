package sda.Arrays;

import java.util.Arrays;

public class Tablice {

    // 1. Napisz metodę print, która wypisze w konsoli elementy tablicy intów,
    // przekazanej jako parametr.
    // 2. Napisz metodę getMax, która przyjmie za parametr tablicę intów,
    // a która zwróci największą wartość z tej tablicy.
    // 3. Napisz metodę getMin, która zwróci najmniejszy element przekazanej tablicy intów.
    // 4. Napisz metodę getSum, która przyjmie za parametr tablicę intów, a któa zwróci sumę jej elementów.
    // 5. Napisz metodę getMaxMinAndSum, która przyjmie za parametr tablicę intów,
    // a która zwróci tablicę trzyelementową, której pierwszy element to wartość największa,
    // drugi to najmniejsza, a trzeci suma wszystkich elementów.
    // 6. Napisz metodę getLarger, która przyjmie za parametry dwie tablice intów,
    // a która zwróci tę tablicę, której suma elementów jest większa.
    // 7. Napisz metodę merge, która za parametry dwie tablice intów, a która zwróci tablicę,
    // która zawierać będzie wszystkie elementy z jednej i drugiej tablicy.

    private int [] tabliczka = new int[]{};

    public void print (int [] tabliczka) {
        System.out.println("Elementy tablicy: " + Arrays.toString(tabliczka));
    }

    public void getMax (int [] tabliczka) {
        double max = tabliczka[0];
        for (int counter = 1; counter < tabliczka.length; counter++) {
            if (tabliczka[counter] > max) {
                max = tabliczka[counter];
            }
        }
        System.out.println("Wartość maksymalna to: " + max);
    }

    public void getMin (int [] tabliczka) {
        double min = tabliczka[0];
        for (int counter = 1; counter < tabliczka.length; counter++) {
            if (tabliczka[counter] < min){
                min = tabliczka[counter];
            }
        }
        System.out.println("Wartość minimalna to: " + min);
    }

    public void getSum (int [] tabliczka) {
        double sum = 0;
        for (int counter : tabliczka) {
            sum += counter;
        }
        System.out.println("Suma elementów tablicy to: " + sum);
    }

    public void getMaxMinAndSum (int [] tabliczka) {
        double max = tabliczka[0];
        for (int counter = 1; counter < tabliczka.length; counter++) {
            if (tabliczka[counter] > max) {
                max = tabliczka[counter];
            }
        }
        double min = tabliczka[0];
        for (int counter = 1; counter < tabliczka.length; counter++) {
            if (tabliczka[counter] < min){
                min = tabliczka[counter];
            }
        }
        double sum = 0;
        for (int counter : tabliczka) {
            sum += counter;
        }
        double[] nowaTablica = new double[]{max, min, sum};
        System.out.println("Tablica z wartościami max, min, sum: " + Arrays.toString(nowaTablica));
    }





}
