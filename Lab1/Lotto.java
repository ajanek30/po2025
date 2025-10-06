import java.util.*;
import java.io.*;
public class Lotto
{

    private int[] tablicaLiczb = new int[6];
    private int min = 1;
    private int max = 49;

    public void uzupelnijTablice()
    {
        for(int i = 0 ; i < tablicaLiczb.length ; i++)
        {
            tablicaLiczb[i] = min + (int)(Math.random() * ((max-min) + 1));
            System.out.println(tablicaLiczb[i]);
        }
    }

    public static void main(String[] args)
    {
        Lotto lotto = new Lotto();
        lotto.uzupelnijTablice();


    }
}
