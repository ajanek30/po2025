package org.example.samochod;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import symulator.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class HelloController implements javafx.fxml.Initializable{

    private final ArrayList<Samochod> flota;
    private Samochod aktualnySamochod;

    @FXML
    private Button wlaczButton;
    @FXML
    private Button wylaczButton;
    @FXML
    private Button testButton;
    @FXML
    private Button zwiekszBiegButton;
    @FXML
    private Button zmniejszBiegButton;
    @FXML
    private Button dodajGazuButton;
    @FXML
    private Button ujmijGazuButton;
    @FXML
    private Button nacisnijButton;
    @FXML
    private Button zwolnijButton;
    @FXML
    private Button dodajNowyButton;
    @FXML
    private Button usunButton;
    @FXML
    private ComboBox<Samochod> samochodComboBox;

    public HelloController(ArrayList<Samochod> flota)
    {
        this.flota = flota;
    }
//    @FXML
//    public void initizalize()
//    {
//        samochodComboBox.getItems().addAll(flota);
//
//        if (!flota.isEmpty()) {
//            samochodComboBox.getSelectionModel().selectFirst();
//            // USTAL STAN POCZĄTKOWY DLA ZMIENNEJ:
//            this.aktualnySamochod = flota.get(0);
//        }
//
//
//        samochodComboBox.setOnAction(event -> {
//            aktualnySamochod = samochodComboBox.getSelectionModel().getSelectedItem();
//        });
//        System.out.println("Wybrano: " + aktualnySamochod.toString());
//    }

    @FXML
    private void onWlaczButton()
    {
        if (aktualnySamochod == null) {
            System.err.println("BŁĄD: Nie wybrano żadnego samochodu lub lista jest pusta.");
            // Tutaj można też wyświetlić komunikat w UI
            return;
        }

        // Kod wykonywany tylko wtedy, gdy aktualnySamochod jest pewne, że istnieje
        aktualnySamochod.wlacz();
        System.out.println("Samochód uruchomiony!");
    }
    @FXML
    private void onWylaczButton() {
        //auto1.wylacz();
        System.out.println("Samochód wylaczony!");
    }
    @FXML
    private void onTestButton() {
        System.out.println("Test!");
    }
    @FXML
    private void onZwiekszBiegButtonButton() {
        System.out.println("Bieg zwiększony!");
    }
    @FXML
    private void onZmniejszBiegButtonButton() {
        System.out.println("Bieg zmniejszony!");
    }
    @FXML
    private void onDodajGazuButton() {
        System.out.println("Gazu dodane!");
    }
    @FXML
    private void onUjmijGazuButton() {
        System.out.println("Gaz ujmiony!");
    }
    @FXML
    private void onNacisnijButton() {
        System.out.println("Nacisniete sprzeglo!");
    }
    @FXML
    private void onZwolnijButton() {
        System.out.println("Puszczone sprzeglo!");
    }
    @FXML
    private void onDodajNowyButton() {
        System.out.println("Dodany Button!");
    }
    @FXML
    private void onUsunButton() {
        System.out.println("Usuniety button!");
    }
    @FXML
    private void onSamochodComboBox()
    {
    }

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        samochodComboBox.getItems().addAll(flota);

        if (!flota.isEmpty()) {
            samochodComboBox.getSelectionModel().selectFirst();
            // USTAL STAN POCZĄTKOWY DLA ZMIENNEJ:
            this.aktualnySamochod = flota.get(0);
        }


        samochodComboBox.setOnAction(event -> {
            aktualnySamochod = samochodComboBox.getSelectionModel().getSelectedItem();
        });
        System.out.println("Wybrano: " + aktualnySamochod.toString());

    }
}
