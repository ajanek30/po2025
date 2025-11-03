package symulator;

public class Komponent
{
    private String nazwa;
    private int waga;
    private int cena;
    static String producent;
    static String model;

    public Komponent(String nazwa, int waga, int cena) {
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWaga() {
        return waga;
    }

    public int getCena() {
        return cena;
    }
}
