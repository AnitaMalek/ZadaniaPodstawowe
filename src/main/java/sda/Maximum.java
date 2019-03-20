package sda;

import java.util.Scanner;

public class Maximum {

    //Zadanie 3.	Napisz program pobierający od użytkownika 3 wartości i wyświetlający największą z nich.


    public void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę1: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj liczbę2: ");
        int liczba2 = scanner.nextInt();
        System.out.println("Podaj liczbę3: ");
        int liczba3 = scanner.nextInt();
        if (liczba1 > liczba2 & liczba1 > liczba3) {
            System.out.println("Max : " + liczba1);
        } else if (liczba2 > liczba1 & liczba2 > liczba3){
            System.out.println("Max: " + liczba2);
        } else {
            System.out.println("Największa jest: " + liczba3 );
        }
    }


}
