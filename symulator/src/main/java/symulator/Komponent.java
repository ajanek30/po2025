package symulator;

public class Komponent
{
    private String nazwa;
    private int waga;
    private int cena;
    static protected String producent;
    static protected String model;
    static protected boolean stanWlaczenia;

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
    public String getProducent()
    {
        return producent;
    }
    public String getModel()
    {
        return model;
    }
}
