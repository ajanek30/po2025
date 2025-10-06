import java.util.HashSet;

public class LottoHashSet
{
    private HashSet<Integer> hashTab = new HashSet<>(6);
    public void wypelnijTablice()
    {
        while(hashTab.size() < 6)
        {
            int num = 1 + (int)(Math.random() * (49));
            hashTab.add(num);
        }
        System.out.println(hashTab);

    }
    public static void main(String[] args)
    {

        LottoHashSet lotto = new LottoHashSet();
        lotto.wypelnijTablice();


    }


}
