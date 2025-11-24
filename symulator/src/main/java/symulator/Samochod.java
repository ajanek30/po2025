package symulator;

public class Samochod
{
    private String nrRejest;
    private String model;
    private int predkoscMax;
    private Pozycja aktualnaPozycja;
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;

    public Samochod(String nrRejest, String model, int predkoscMax, Pozycja aktualnaPozycja,Silnik silnik,SkrzyniaBiegow skrzynia) {
        //komponent.stanWlaczenia = false;
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkoscMax = predkoscMax;
        this.aktualnaPozycja = aktualnaPozycja;
        this.silnik = silnik;
        this.skrzynia = skrzynia;
    }
    public void wlacz()
    {
        silnik.uruchom();
    }
    public void wylacz()
    {
        silnik.zatrzymaj();
    }

}

