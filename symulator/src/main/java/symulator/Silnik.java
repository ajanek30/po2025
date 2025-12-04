package symulator;

public class Silnik extends Komponent
{
    private int maxObroty;
    private int obroty;

    public Silnik(String producent,String model,int maxObroty,String nazwa,int waga,int cena,boolean stanWlaczenia) {
        super(producent,model,nazwa,waga,cena,stanWlaczenia);
        this.maxObroty = maxObroty;
        this.obroty = 800;


    }
    public void uruchom()
    {
        stanWlaczenia = true;
        this.obroty = 800;
    }
    public void zatrzymaj()
    {
        stanWlaczenia = false;
        obroty = 0;
    }
    public void zwiekszObroty()
    {
        if(obroty >= 800)
        {
            this.obroty += 100;
        }
        else if ((obroty + 100) == maxObroty)
        {
            obroty = maxObroty;
        }

    }
    public void zmniejszObroty()
    {
        if(obroty >= 900)
        {
            obroty -= 100;
        }
        else if(obroty == 800)
        {
            obroty = 800;
        }
        else
        {
            obroty = 0;
        }

    }
    public int getObroty()
    {
        return this.obroty;
    }
}

