package sda.Methods;

public class Metody {

    //1. Napisz metodę multiply, która przyjmie dwa parametry typu int,
    // a która zwróci wynik mnożenia tych parametrów.
    // 2. Napisz metodę power, która przyjmie dwa parametry typu int,
    // a która zwróci wynik potęgowania o podstawie i wykładniku takich, jak przekazano.
    // 3. Napisz metodę, która przyjmie jako pierwszy parametr wartość typu String, a jako drugi znak.
    // Metoda zwróci liczbę wystąpień znaku w łańcuchu.
    // 4. Napisz metodę contains, która przyjmuje dwa łańcuchy jako parametry,
    // a która zwraca informację, czy pierwszy łańcuch zawiera drugi.


    private double a = 0;
    private double b = 0;

    public double multiply (double a, double b) {
        return a * b;
    }

    public double power (double a, double b) {
        return Math.pow(a, b);
    }

    public int countChar(String str, char ch) {
        int count = 0;
        for(int i=0; i < str.length(); i++) {
            if(str.charAt(i) == ch)
            count++;
        }
        return count;
    }






}
