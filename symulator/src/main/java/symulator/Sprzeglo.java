package symulator;

public class Sprzeglo extends Komponent {
    private boolean stanSprzegla;

    public Sprzeglo(String producent, String model, String nazwa, int waga, int cena, boolean stanWlaczenia) {
        super(producent, model, nazwa, waga, cena, stanWlaczenia);
        this.stanSprzegla = false;
    }

    // Wciśnięcie sprzęgła działa tylko jeśli komponent jest włączony
    public void wcisnij() {
        if (isWlaczony()) {
            stanSprzegla = true;
            System.out.println("Sprzęgło wciśnięte");
        } else {
            System.out.println("Nie można wcisnąć sprzęgła – komponent wyłączony");
        }
    }

    public void zwolnij() {
        if (isWlaczony()) {
            stanSprzegla = false;
            System.out.println("Sprzęgło zwolnione");
        }
    }

    public boolean isStanSprzegla() {
        return stanSprzegla;
    }
}
