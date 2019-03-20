package sda;

public class PositiveOrNegative {

    //Zadanie 1. Napisz program określający czy podana przez użytkownika jest
    // dodatnia lub ujemna

    //Test Data
    //Input number: 35
    //Expected Output :
    //Number is positive


    private int liczba;

    public void posOrNeg(int liczba) {
        if (liczba < 0) {
            System.out.println("Liczba jest ujemna");
        } else {
            System.out.println("Liczba jest dodatnia");
        }
    }



}
