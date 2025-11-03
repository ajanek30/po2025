package symulator;

public class Sprzeglo extends Komponent
{
    protected boolean stanSprzegla;

    public Sprzeglo(String producent,String model,String nazwa, int waga, int cena)
    {
        super(nazwa,waga,cena);
        Komponent.producent = producent;
        Komponent.model = model;
        this.stanSprzegla = false;
    }
    public void wcisnij()
    {
        if(stanWlaczenia)
        {
            this.stanSprzegla = true;
        }


    }
    public void zwolnij()
    {
        if(stanWlaczenia)
        {
            this.stanSprzegla = false;
        }
    }
    public boolean getStanSprzegla()
    {
        return this.stanSprzegla;
    }

}
