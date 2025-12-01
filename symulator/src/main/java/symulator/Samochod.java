package symulator;

public class Samochod
{
    private String nrRejest;
    private String model;
    private int predkoscMax;
    private Pozycja aktualnaPozycja;
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Sprzeglo sprzeglo;
    private int waga;


    public Samochod(String nrRejest, String model, int predkoscMax,int waga, Pozycja aktualnaPozycja,Silnik silnik,SkrzyniaBiegow skrzynia,Sprzeglo sprzeglo) {
        //komponent.stanWlaczenia = false;
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkoscMax = predkoscMax;
        this.aktualnaPozycja = aktualnaPozycja;
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.waga = waga;
        this.sprzeglo = sprzeglo;
    }
    public void wlacz()
    {
        silnik.uruchom();
    }
    public void wylacz()
    {
        silnik.zatrzymaj();
    }

    public String getNrRejest() {
        return nrRejest;
    }
    public Sprzeglo getSprzeglo()
    {
        return sprzeglo;
    }
    public int getWaga()
    {
        return waga;
    }
    public void zwiekszBieg()
    {
        skrzynia.zwiekszBieg();
    }

    public String getModel() {
        return model;
    }

    public int getPredkoscMax() {
        return predkoscMax;
    }

    public Pozycja getAktualnaPozycja() {
        return aktualnaPozycja;
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public SkrzyniaBiegow getSkrzynia() {
        return skrzynia;
    }
    //on nie dziedziczy bezposrednio po tych komponentach i przez to nie widzi co powinoien

}

