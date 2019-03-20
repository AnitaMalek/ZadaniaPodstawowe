package sda;

public enum DniTygodnia {

    //Zadanie 4.	Napisz program, który pobiera od użytkownika wartość od 1-7 i na jej podstawie wyświetla podany przez użytkownika dzień tygodnia.
    //
    //Test Data
    //Input number: 3
    //Expected Output :
    //Wednesday

    MONDAY(1), TUESDAY(2),
    WEDNESDAY(3), THURSDAY(4),
    FRIDAY(5), SATURDAY(6),
    SUNDAY(7);

private int index;

DniTygodnia(int index) {
    this.index = index;
}

    public int getIndex() {
        return index;
    }



}
