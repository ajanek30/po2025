package symulator;

public class Sprzeglo extends Komponent
{
    protected boolean stanSprzegla;

    public Sprzeglo(String nazwa, int waga, int cena)
    {
        super(nazwa,waga,cena);
        this.stanSprzegla = false;
    }
    public void wcisnij()
    {
        this.stanSprzegla = true;

    }
    public void zwolnij()
    {
        this.stanSprzegla = false;
    }
    public boolean getStanSprzegla()
    {
        return this.stanSprzegla;
    }

}
