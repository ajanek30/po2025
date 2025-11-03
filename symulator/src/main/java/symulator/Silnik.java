package symulator;

public class Silnik extends Komponent
{
    private int maxObroty;
    private int obroty;

    public Silnik(int maxObroty,String nazwa,int waga,int cena) {
        super(nazwa,waga,cena);
        this.maxObroty = maxObroty;
        this.obroty = 800;
    }
    public void uruchom()
    {
        this.obroty = 800;
    }
    public void zatrzymaj()
    {
        this.obroty = 0;
    }
    public void zwiekszObroty()
    {
        this.obroty += 100;
    }
    public void zmniejszObroty()
    {
        this.obroty -= 100; ;
    }
}

