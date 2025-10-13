import java.util.ArrayList;

public class LottoArrayList
{
    private static final int MIN = 1;
    private static final int MAX = 49;
    protected ArrayList<Integer> tab = new ArrayList<>();


    public ArrayList<Integer> wylosuj()
    {
        tab.clear();
        for(int i = 0 ; i < 6 ; i++)
        {
            int num = (MIN +  (int)(Math.random() * ((MAX-MIN) + 1)));
            if(!tab.contains(num))
            {
                tab.add(num);
            }
        }
        return tab;
    }
    public void wyswietl(ArrayList<Integer> tablica)
    {
        System.out.println(tablica);

    }

}
