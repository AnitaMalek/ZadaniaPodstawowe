package sda.Liczbowe;

import java.util.Scanner;

public class SumAndAverage {

    //Zadanie 6.	Napisz program pobierający od użytkownika 5 liczb, który wyliczy ich sumę, średnią.
    //Test Data
    //Input the 5 numbers : 1 2 3 4 5
    //Expected Output :
    //Input the 5 numbers :
    //The sum of 5 no is : 15
    //The Average is : 3.0

    public void sum () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczby: ");
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        int liczba3 = scanner.nextInt();
        int liczba4 = scanner.nextInt();
        int liczba5 = scanner.nextInt();
        int wynik = liczba1 + liczba2 + liczba3 + liczba4 + liczba5;
        System.out.println("Wynik dodawania: " + wynik);
    }

    public void average () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczby: " );
        int l1 = scan.nextInt();
        int l2 = scan.nextInt();
        int l3 = scan.nextInt();
        int l4 = scan.nextInt();
        int l5 = scan.nextInt();
        double wynik = l1 + l2 + l3 + l4 + l5;
        double srednia = wynik / 5;
        System.out.println("Srednia liczb to: " + srednia);
    }
}
