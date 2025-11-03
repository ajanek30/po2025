package symulator;

public class MainSymulator
{
    public static void main(String[] args)
    {
        Samochod autko1 = new Samochod(true,"KK11223","Insignia",230,new Pozycja(2.2,3.3),new Silnik(4000,"2.0TDI",1500,42999),new SkrzyniaBiegow(1,5,3,"Sprzeglo",1000,1000,new Sprzeglo("Sprzegielko",100,400)));
        autko1.wlacz();
        Silnik silniczek = new Silnik(4500,"3.0TDI",500,4500);
        SkrzyniaBiegow skrzynka = new SkrzyniaBiegow(1,6,3,"SkrzyniaTOP",2322,4999,new Sprzeglo("najlepsze",1000,5000));
        silniczek.zwiekszObroty();
        skrzynka.zwiekszBieg();
        skrzynka.getAktualnyBieg();

    }
}
