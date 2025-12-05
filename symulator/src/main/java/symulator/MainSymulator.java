package symulator;

public class MainSymulator
{
    public static void main(String[] args)
    {
        Silnik silnik1 = new Silnik( "Volkswagen", "323kds",5000,"2.0TDI",350,3995);
        Sprzeglo sprzeglo1 = new Sprzeglo(silnik1,"Yomaha","FuryX","sprzeglo",344,2137);
        SkrzyniaBiegow skrzynia1 = new SkrzyniaBiegow("Hashimoto","322234",1,6,3,"skrzynia",150,1499,sprzeglo1);
        Pozycja pozycja1 = new Pozycja(1.0,1.0);

       // Samochod autko1 = new Samochod("KK11223","Insignia",230,6666,pozycja1,silnik1,skrzynia1,sprzeglo1);
/// /////////////////////////////////////////////





    }
}
