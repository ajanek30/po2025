package symulator;

public class Sprzeglo extends Komponent
{
    protected boolean stanSprzegla;
    //public Komponent komponent;

    public Sprzeglo(String producent,String model,String nazwa, int waga, int cena,boolean stanWlaczenia)
    {
        super(producent,model,nazwa,waga,cena,stanWlaczenia);
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
