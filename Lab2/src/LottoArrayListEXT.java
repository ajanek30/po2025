import java.util.ArrayList;
import java.util.Scanner;

public class LottoArrayListEXT extends LottoArrayList
{
    private ArrayList<Integer> liczbyUzytkownika = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public int counter = 0;

    public ArrayList<Integer> wczytajLiczbyUzytkownika()
    {

        while(scanner.hasNextInt() && counter < 6)
        {
            counter++;
            int num = scanner.nextInt();
            liczbyUzytkownika.add(num);

        }
        return liczbyUzytkownika;
    }




}
