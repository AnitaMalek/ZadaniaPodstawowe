package sda.Firmowe;

public class Pracownik {

    //Zadanie 1.	Napisz klasę Pracownik, która przechowuje trzy pola:
    //-pesel
    // -płeć (char ‘m’, ‘k’ lub enum)
    // -Wiek
    // Następnie utwórz klasę Firma, w której wykorzystasz klasę pracownik
    // do utworzenia dwóch obiektów przechowujących dane pracowników (wymyśl sobie jakieś)
    // i później wyświetlasz je na ekran.

    private long pesel;
    private char plec;
    private int wiek;

    Pracownik (long pesel, char plec, int wiek) {
        this.pesel = pesel;
        this.plec = plec;
        this.wiek = wiek;
    }

    public long getPesel() {
        return pesel;
    }

    public char getPlec() {
        return plec;
    }

    public int getWiek() {
        return wiek;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "pesel=" + pesel +
                ", plec=" + plec +
                ", wiek=" + wiek +
                '}';
    }
}
