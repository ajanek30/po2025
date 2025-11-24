package symulator;

public class Pozycja
{
    private double x;
    private double y;

    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void aktualizujPozycje(double deltaX, double deltaY)
    {
        //warunek z stanwlaczenia do uzup chba
            this.x += deltaX;
            this.y += deltaY;


    }

    public String getPozycja()
    {
        return String.valueOf(this.x) + "," + String.valueOf(this.y);
    }
}
