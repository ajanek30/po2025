import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainLottoArrayList
    {
        public static void main(String[] args)
        {

            LottoArrayList obiekt = new LottoArrayList();
            LottoArrayListEXT obiekt2 = new LottoArrayListEXT();


            ArrayList<Integer> lista = obiekt.wylosuj();
            ArrayList<Integer> listaUzytkownika = obiekt2.wczytajLiczbyUzytkownika();




            System.out.println("Wylosowane numery: ");
            obiekt.wyswietl(lista);
            System.out.println("Numery użytkownika: ");
            obiekt2.wyswietl(listaUzytkownika);
            sprawdzTrafienia(lista,listaUzytkownika);
            pelneTrafienie(obiekt,obiekt2,lista,listaUzytkownika);





        }
        public static int sprawdzTrafienia(ArrayList<Integer> lista,ArrayList<Integer> listaUzytkownika)
        {
            int counter = 0 ;
            for(int i = 0 ; i < 6 ; i++)
            {
                if(lista.contains(listaUzytkownika.get(i)))
                {
                    counter++;
                }
            }
            System.out.println("Trafione: " + counter);
            return counter;
        }
        public static void pelneTrafienie(LottoArrayList obiekt,LottoArrayListEXT obiekt2)
        {

            ArrayList<Integer> odUzytkownika = obiekt2.wczytajLiczbyUzytkownika();
            ArrayList<Integer> tab = ///;
            while(true)
            {
                tab = obiekt.wylosuj();
                tab.clear();
                if(liczbaTrafien == 6)
                {
                    System.out.println("Hurra");
                }
            }
        }
    }