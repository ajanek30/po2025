import java.util.HashSet;

public class LottoHashSet
{
    private HashSet<Integer> hashTab = new HashSet<>(6);
    public HashSet<Integer> wypelnijTablice()
    {
        while(hashTab.size() < 6)
        {

            int num = 1 + (int)(Math.random() * (49));
            hashTab.add(num);
        }
        return hashTab;


    }
    public static void main(String[] args)
    {
        HashSet<Integer> tab = new HashSet<>();
        LottoHashSet lotto = new LottoHashSet();
        lotto.wypelnijTablice();


    }


}
