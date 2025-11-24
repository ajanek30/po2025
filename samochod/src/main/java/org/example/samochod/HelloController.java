package org.example.samochod;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
//package symulator.*;


public class HelloController {
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
    private ComboBox samochodComboBox;


    @FXML
    private void onWlaczButton() {
        System.out.println("Samochód uruchomiony!");
    }
    @FXML
    private void onWylaczButton() {
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
//    @FXML
//    private void onNacisnijButton() {
//        System.out.println("Nacisniete sprzeglo!");
//    }
    //ComboBoX


}
