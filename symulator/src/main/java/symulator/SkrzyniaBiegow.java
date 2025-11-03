package symulator;

public class SkrzyniaBiegow extends Komponent
{
    private int aktualnyBieg;
    private int iloscBiegow;
    private int aktualnePrzelozenie;
    Sprzeglo sprzeglo;

    public SkrzyniaBiegow(String producent,String model,int aktualnyBieg, int iloscBiegow, int aktualnePrzelozenie,String nazwa,int waga,int cena,Sprzeglo sprzeglo)
    {
        super(nazwa,waga,cena);
        this.aktualnyBieg = aktualnyBieg;
        this.iloscBiegow = iloscBiegow;
        this.aktualnePrzelozenie = aktualnePrzelozenie;
        this.sprzeglo = sprzeglo;
        Komponent.producent = producent;
        Komponent.model = model;
    }

    public int getAktualnyBieg() {
        return aktualnyBieg;
    }

    public int getAktualnePrzelozenie() {
        return aktualnePrzelozenie;
    }
    public void zwiekszBieg()
    {
        if(aktualnyBieg >= 6)
        {
            this.aktualnyBieg = 6;
        }
        else if(sprzeglo.stanSprzegla)
        {
            this.aktualnyBieg++;
        }
    }
    public void zmniejszBieg()
    {
        if(aktualnyBieg <= 1)
        {
            this.aktualnyBieg = 1;
        }
        else if(sprzeglo.stanSprzegla)
        {
            this.aktualnyBieg--;
        }

    }
}
