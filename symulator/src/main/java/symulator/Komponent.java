package symulator;

public class Komponent {
    private String nazwa;
    private int waga;
    private int cena;
    private String producent;
    private String model;
    protected boolean stanWlaczenia;

    public Komponent(String producent, String model, String nazwa, int waga, int cena, boolean stanWlaczenia) {
        this.producent = producent;
        this.model = model;
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
        this.stanWlaczenia = stanWlaczenia;
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

    public String getProducent() {
        return producent;
    }

    public String getModel() {
        return model;
    }

    public boolean isWlaczony() {
        return stanWlaczenia;
    }

    public void wlacz() {
        stanWlaczenia = true;
        System.out.println(nazwa + " wlaczony");
    }

    public void wylacz() {
        stanWlaczenia = false;
        System.out.println(nazwa + " wylaczony");
    }
}
