package sda;

import sda.Arrays.Tablice;
import sda.Firmowe.Firma;
import sda.Liczbowe.CubicNumbers;
import sda.Methods.Metody;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        //zad.1:
        // PositiveOrNegative sprawdzanie = new PositiveOrNegative();

        //sprawdzanie.posOrNeg(9);

       //zad.3:
//        Maximum maximum = new Maximum();
//
//        maximum.max();

        //zad. 4:

//        int szukanyIndex = 1;
//        DniTygodnia[] tablica = DniTygodnia.values();
//        for (DniTygodnia dzien : tablica) {
//            if (dzien.getIndex() == szukanyIndex) {
//                System.out.println(dzien);
//            }
//        }

//SumAndAverage suma = new SumAndAverage();
//suma.average();

//
//        CubicNumbers cubicNumbers = new CubicNumbers();
//        cubicNumbers.wyswietlacz(7);


//        Metody mnozenie = new Metody();
//        System.out.println(mnozenie.multiply(3,4));
//        System.out.println(mnozenie.power(3,3));
//        System.out.println(mnozenie.countChar("falubaz", 'a'));

        Tablice tablice = new Tablice();

        tablice.print(new int[]{3, 4, 5, 7, 8});
        tablice.getMax(new int[]{3, 6, 8, 100, 121, 5});
        tablice.getMin(new int[]{3, 6, 8,-19,-2, 100, 121, 5});
        tablice.getSum(new int[]{3, 5, 8, 4});
        tablice.getMaxMinAndSum(new int[]{2, -19, 20, 3, 55, -23});


    }
}
