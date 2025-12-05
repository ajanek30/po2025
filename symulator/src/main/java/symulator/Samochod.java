package symulator;

import javafx.application.Platform;
import javafx.scene.image.ImageView;


public class Samochod implements Runnable {
    private String nrRejest;
    private String model;
    //private int predkoscMax;
    private int predkosc;
    //pozycja
    private Pozycja aktualnaPozycja;
    private Pozycja cel;
    //
    private Thread watek;
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Sprzeglo sprzeglo;
    private int waga;
    private ImageView carImageView;


    public Samochod(String nrRejest, String model, int predkosc, int waga, Pozycja aktualnaPozycja, Silnik silnik, SkrzyniaBiegow skrzynia, Sprzeglo sprzeglo) {
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkosc = predkosc;
        this.aktualnaPozycja = aktualnaPozycja;
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.waga = waga;
        this.sprzeglo = sprzeglo;
        //this.carImageView = carImageView;

        watek = new Thread(this);
        watek.setDaemon(true);
        watek.start();
    }

    @Override
    public String toString() {
        return model + " (" + nrRejest + ")";
    }

    public void jedzDo(Pozycja cel) {
        this.cel = cel;
    }

    @Override
    public void run() {
        double deltat = 0.1;

        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!silnik.getStanWlaczenia()) {
                cel = null; // zatrzymanie ruchu jeśli silnik wyłączony
                continue;
            }

            Pozycja lokalnyCel = cel; // zabezpieczenie przed NullPointerException
            if (lokalnyCel != null) {
                double dx = lokalnyCel.getX() - aktualnaPozycja.getX();
                double dy = lokalnyCel.getY() - aktualnaPozycja.getY();
                double odleglosc = Math.sqrt(dx*dx + dy*dy);

                double krok = predkosc * deltat;
                if (krok > odleglosc) krok = odleglosc;

                if (odleglosc < 0.5) {
                    aktualnaPozycja.setX(lokalnyCel.getX());
                    aktualnaPozycja.setY(lokalnyCel.getY());
                    cel = null;
                    continue;
                }

                double vx = krok * dx / odleglosc;
                double vy = krok * dy / odleglosc;

                aktualnaPozycja.setX(aktualnaPozycja.getX() + vx);
                aktualnaPozycja.setY(aktualnaPozycja.getY() + vy);

                if (carImageView != null) {
                    Platform.runLater(() -> {
                        carImageView.setTranslateX(aktualnaPozycja.getX());
                        carImageView.setTranslateY(aktualnaPozycja.getY());
                    });
                }
            }
        }
    }

    public void wlacz()
    {
        silnik.uruchom();
    }
    public void wylacz()
    {
        silnik.zatrzymaj();
    }

    public String getNrRejest() {
        return nrRejest;
    }
    public Sprzeglo getSprzeglo()
    {
        return sprzeglo;
    }
    public int getWaga()
    {
        return waga;
    }

    public String getModel() {
        return model;
    }

//    public int getPredkoscMax() {
//        return predkoscMax;
//    }
    public int getPredkosc()
    {
        return predkosc;
    }

    public Pozycja getAktualnaPozycja() {
        return aktualnaPozycja;
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public SkrzyniaBiegow getSkrzynia() {
        return skrzynia;
    }

    public ImageView getCarImageView() {
        return carImageView;
    }
    public void setCarImageView(ImageView carImageView)
    {
        this.carImageView = carImageView;
    }
    //on nie dziedziczy bezposrednio po tych komponentach i przez to nie widzi co powinoien

}

