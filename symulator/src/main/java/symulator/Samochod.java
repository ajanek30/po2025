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


    public Samochod(String nrRejest, String model, int predkosc, int waga, Pozycja aktualnaPozycja, Silnik silnik, SkrzyniaBiegow skrzynia, Sprzeglo sprzeglo, ImageView carImageView) {
        watek = new Thread(this);
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkosc = predkosc;
        this.aktualnaPozycja = aktualnaPozycja;
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.waga = waga;
        this.sprzeglo = sprzeglo;
        this.carImageView = carImageView;

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
                Thread.sleep(100); // 100 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (cel != null) {

                double dx = cel.getX() - aktualnaPozycja.getX();
                double dy = cel.getY() - aktualnaPozycja.getY();
                double odleglosc = Math.sqrt(dx * dx + dy * dy);

                // dotarcie do celu
                if (odleglosc < 0.1) {
                    cel = null;
                    continue;
                }

                double vx = predkosc * deltat * dx / odleglosc;
                double vy = predkosc * deltat * dy / odleglosc;

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


    //on nie dziedziczy bezposrednio po tych komponentach i przez to nie widzi co powinoien

}

