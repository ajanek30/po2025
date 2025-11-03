package symulator;

public class SkrzyniaBiegow extends Komponent
{
    private int aktualnyBieg;
    private int iloscBiegow;
    private int aktualnePrzelozenie;
    Sprzeglo sprzeglo;

    public SkrzyniaBiegow(int aktualnyBieg, int iloscBiegow, int aktualnePrzelozenie,String nazwa,int waga,int cena,Sprzeglo sprzeglo)
    {
        super(nazwa,waga,cena);
        this.aktualnyBieg = aktualnyBieg;
        this.iloscBiegow = iloscBiegow;
        this.aktualnePrzelozenie = aktualnePrzelozenie;
        this.sprzeglo = sprzeglo;
    }

    public int getAktualnyBieg() {
        return aktualnyBieg;
    }

    public int getAktualnePrzelozenie() {
        return aktualnePrzelozenie;
    }
    public void zwiekszBieg()
    {
        sprzeglo.wcisnij();
        if(sprzeglo.stanSprzegla)
        {
            this.aktualnyBieg++;
        }
    }
    public void zmniejszBieg()
    {
        sprzeglo.wcisnij();
        if(sprzeglo.getStanSprzegla())
        {
            this.aktualnyBieg--;
        }

    }
}
