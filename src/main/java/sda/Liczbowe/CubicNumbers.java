package sda.Liczbowe;

import java.util.Scanner;

public class CubicNumbers {

    //Zadanie 7. Napisz program pobierający od użytkownika liczbę n i na jej podstawie
    // wyświetlający kwadrat każdej liczby całkowitej <= n.
    //Test Data
    //Input number of terms : 4
    //Expected Output :
    //Number is : 1 and cube of 1 is : 1
    //Number is : 2 and cube of 2 is : 8
    //Number is : 3 and cube of 3 is : 27
    //Number is : 4 and cube of 4 is : 64
public void cubic () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę n: ");
    int n = scanner.nextInt();
    for (int i = 1; i <= n; i++) {
       int m = i * i * i;
        System.out.println("Liczba to: " + " " + i + "Cubic to: " + " " + i + "Wynik to: " + " " + m);
    }
}

//Zadanie 8. Napisz program wyświetlający poniższy zwór w zależności do zadanej wartości:
//1
//22
//333
//4444

    public static void wyswietlacz (int height){

            for(int i =1 ; i <= height;i++){
                for(int j =1; j <= i; j++){
                    System.out.print(i);
                }
                System.out.print("\n");
            }
        }


}
