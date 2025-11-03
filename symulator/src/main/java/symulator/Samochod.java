package symulator;

public class Samochod
{
    private boolean stanWlaczenia;
    private String nrRejest;
    private String model;
    private int predkoscMax;
    private Pozycja aktualnaPozycja;
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;

    public Samochod(boolean stanWlaczenia, String nrRejest, String model, int predkoscMax, Pozycja aktualnaPozycja,Silnik silnik,SkrzyniaBiegow skrzynia) {
        this.stanWlaczenia = stanWlaczenia;
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
//Samochod autko1 = new Samochod(true,"KK11223","Insignia",230,new Pozycja(2.2,3.3),new Silnik(4000,"2.0TDI",1500,42999));
