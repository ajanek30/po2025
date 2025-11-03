package symulator;

public class MainSymulator
{
    public static void main(String[] args)
    {
        Silnik silnik1 = new Silnik(Komponent.producent = "Volkswagen",Komponent.model = "323kds",5000,"2.0TDI",350,3995);
        Sprzeglo sprzeglo1 = new Sprzeglo("Yomaha","FuryX","sprzeglo",344,2137);
        SkrzyniaBiegow skrzynia1 = new SkrzyniaBiegow("Hashimoto","322234",1,6,3,"skrzynia",150,1499,sprzeglo1);
        Pozycja pozycja1 = new Pozycja(1.0,1.0);

        Samochod autko1 = new Samochod("KK11223","Insignia",230,pozycja1,silnik1,skrzynia1);
/// /////////////////////////////////////////////
        autko1.wlacz();
        System.out.println(silnik1.getModel());
        System.out.println(silnik1.getProducent());
        System.out.println(silnik1.getObroty());
        silnik1.zwiekszObroty();
        System.out.println(silnik1.getObroty());
        sprzeglo1.wcisnij();
        skrzynia1.zwiekszBieg();
        sprzeglo1.zwolnij();
        System.out.println(skrzynia1.getAktualnyBieg());
        sprzeglo1.wcisnij();
        skrzynia1.zmniejszBieg();
        sprzeglo1.zwolnij();
        System.out.println(skrzynia1.getAktualnyBieg());
        //silnik1.zatrzymaj();
        silnik1.zwiekszObroty();
        sprzeglo1.wcisnij();
        System.out.println(sprzeglo1.getStanSprzegla());
        System.out.println(pozycja1.getPozycja());
        pozycja1.aktualizujPozycje(2.2,3.3);
        System.out.println(pozycja1.getPozycja());
        silnik1.zmniejszObroty();
        System.out.println(silnik1.getObroty());
        silnik1.zmniejszObroty();
        System.out.println(silnik1.getObroty());
        silnik1.zmniejszObroty();
        System.out.println(silnik1.getObroty());





    }
}
