package sda.Liczbowe;

public class FloatingNumber {

    // Zadanie 5. Napisz program pobierający od użytkownika dwie liczby zmienno-przecinkowe,
    // który sprawdza czy podane wartości są jednakowe, lub nie do trzech miejsc dziesiętnych.

    //Test Data
    //Input ﬂoating-point number: 1256
    //Input ﬂoating-point another number: 3254
    //Expected Output :
    //They are diﬀerent

public static void porownanie () {
    double f1 = .000;

    for (int i = 1; i <= 11; i++) {
        f1 += .1;
    }
    double f2 = .000;
    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);

    if (f1 == f2)
        System.out.println("f1 and f2 are equal\n");
    else
        System.out.println("f1 and f2 are not equal\n");

}
}
