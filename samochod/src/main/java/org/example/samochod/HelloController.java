package org.example.samochod;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import symulator.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class HelloController implements javafx.fxml.Initializable{

    private final ArrayList<Samochod> flota;
    private Samochod aktualnySamochod;

    @FXML
    private TextField obrotySilnikTextField;
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
    ///  text fieldy
    @FXML
    private TextField wagaSamochodTextField;
    @FXML
    private TextField nrRejTextField;
    @FXML
    private TextField modelTextField;
    @FXML
    private TextField predkoscTextField;
    @FXML
    private TextField nazwaSkrzyniaTextField;
    @FXML
    private TextField cenaSkrzyniaTextField;
    @FXML
    private TextField wagaSkrzyniaTextField;
    @FXML
    private TextField biegSkrzyniaTextField;
    @FXML
    private TextField nazwaSilnikTextField;
    @FXML
    private TextField cenaSilnikTextField;
    @FXML
    private TextField wagaSilnikTextField;
    @FXML
    private TextField nazwaSprzegloTextField;
    @FXML
    private TextField cenaSprzegloTextField;
    @FXML
    private TextField wagaSprzegloTextField;
    @FXML
    private TextField stanSprzegloTextField;
    @FXML
    private ComboBox<Samochod> samochodComboBox;
    @FXML
    private ImageView carImageView;
    @FXML
    private VBox mapa;

    public HelloController(ArrayList<Samochod> flota)
    {
        this.flota = flota;
    }

    public void refresh() {
        if (aktualnySamochod == null) {
            // Jeśli nie ma aktualnego samochodu, wyczyść wszystkie pola
            wagaSamochodTextField.clear();
            nrRejTextField.clear();
            modelTextField.clear();
            predkoscTextField.clear();
            nazwaSkrzyniaTextField.clear();
            cenaSkrzyniaTextField.clear();
            wagaSkrzyniaTextField.clear();
            biegSkrzyniaTextField.clear();
            nazwaSilnikTextField.clear();
            cenaSilnikTextField.clear();
            wagaSilnikTextField.clear();
            obrotySilnikTextField.clear();
            nazwaSprzegloTextField.clear();
            cenaSprzegloTextField.clear();
            wagaSprzegloTextField.clear();
            stanSprzegloTextField.clear();
            return;
        }

        wagaSamochodTextField.setText(String.valueOf(aktualnySamochod.getWaga()));
        nrRejTextField.setText(String.valueOf(aktualnySamochod.getNrRejest()));
        modelTextField.setText(String.valueOf(aktualnySamochod.getModel()));
        predkoscTextField.setText(String.valueOf(aktualnySamochod.getPredkosc()));
        nazwaSkrzyniaTextField.setText(String.valueOf(aktualnySamochod.getSkrzynia().getNazwa()));
        cenaSkrzyniaTextField.setText(String.valueOf(aktualnySamochod.getSkrzynia().getCena()));
        wagaSkrzyniaTextField.setText(String.valueOf(aktualnySamochod.getSkrzynia().getWaga()));
        biegSkrzyniaTextField.setText(String.valueOf(aktualnySamochod.getSkrzynia().getAktualnyBieg()));
        nazwaSilnikTextField.setText(String.valueOf(aktualnySamochod.getSilnik().getNazwa()));
        cenaSilnikTextField.setText(String.valueOf(aktualnySamochod.getSilnik().getCena()));
        wagaSilnikTextField.setText(String.valueOf(aktualnySamochod.getSilnik().getWaga()));
        obrotySilnikTextField.setText(String.valueOf(aktualnySamochod.getSilnik().getObroty()));
        nazwaSprzegloTextField.setText(String.valueOf(aktualnySamochod.getSprzeglo().getNazwa()));
        cenaSprzegloTextField.setText(String.valueOf(aktualnySamochod.getSprzeglo().getCena()));
        wagaSprzegloTextField.setText(String.valueOf(aktualnySamochod.getSprzeglo().getWaga()));
        stanSprzegloTextField.setText(String.valueOf(aktualnySamochod.getSprzeglo().isStanSprzegla()));


        Platform.runLater(() -> {
            carImageView.setTranslateX(aktualnySamochod.getAktualnaPozycja().getX());
            carImageView.setTranslateX(aktualnySamochod.getAktualnaPozycja().getY());

        });
    }
    public void openAddCarWindow() throws IOException
    {
        FXMLLoader loader = new
                FXMLLoader(getClass().getResource("DodajSamochod.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        DodajSamochodController controller = loader.getController();
        controller.setMainController(this);
        stage.setTitle("Dodaj nowy samochód");
        stage.show();
    }
    public void addCarToList(Samochod nowySamochod) {
        if (nowySamochod == null) return;

        // Dodaj do listy
        flota.add(nowySamochod);

        // Ustaw nowy samochód jako aktualny
        aktualnySamochod = nowySamochod;

        // Odśwież ComboBox — konwertujemy ArrayList na ObservableList na potrzeby ComboBox
        samochodComboBox.getItems().setAll(flota);
        samochodComboBox.getSelectionModel().select(nowySamochod);

        refresh(); // odśwież pola w UI
    }
    @FXML
    private void onWlaczButton()
    {
        if (aktualnySamochod == null) {
            System.err.println("BŁĄD: Nie wybrano żadnego samochodu lub lista jest pusta.");
            return;
        }

        aktualnySamochod.wlacz();
        System.out.println("Samochód uruchomiony!");
        refresh();
    }
    @FXML
    private void onWylaczButton() {
        if (aktualnySamochod == null) {
            System.err.println("Nie wybrano samochodu!");
            return;
        }
        aktualnySamochod.wylacz();
        refresh();
    }
    @FXML
    private void onZwiekszBiegButtonButton() {
        if (aktualnySamochod == null) {
            System.err.println("Nie wybrano samochodu!");
            return;
        }
        aktualnySamochod.getSkrzynia().zwiekszBieg();
        refresh();
    }
    @FXML
    private void onZmniejszBiegButtonButton() {
        if (aktualnySamochod == null) {
            System.err.println("Nie wybrano samochodu!");
            return;
        }
        aktualnySamochod.getSkrzynia().zmniejszBieg();
        refresh();
    }
    @FXML
    private void onDodajGazuButton() {
        if (aktualnySamochod == null) {
            System.err.println("Nie wybrano samochodu!");
            return;
        }
        aktualnySamochod.getSilnik().zwiekszObroty();
        refresh();
    }
    @FXML
    private void onUjmijGazuButton() {
        if (aktualnySamochod == null) {
            System.err.println("Nie wybrano samochodu!");
            return;
        }
        aktualnySamochod.getSilnik().zmniejszObroty();
        refresh();
    }
    @FXML
    private void onNacisnijButton() {
        if (aktualnySamochod == null) {
            System.err.println("Nie wybrano samochodu!");
            return;
        }
        aktualnySamochod.getSprzeglo().wcisnij();
        refresh();
    }
    @FXML
    private void onZwolnijButton() {
        if (aktualnySamochod == null) {
            System.err.println("Nie wybrano samochodu!");
            return;
        }
        aktualnySamochod.getSprzeglo().zwolnij();
        refresh();
    }
    @FXML
    private void onDodajNowyButton() throws IOException {
        openAddCarWindow();
        System.out.println("Dodany Button!");
        refresh();
    }
    @FXML
    private void onUsunButton() {
        if (aktualnySamochod != null) {
            // Usuń z listy
            flota.remove(aktualnySamochod);

            // Odśwież ComboBox
            samochodComboBox.getItems().setAll(flota);

            // Ustaw nowy aktualny samochód lub null jeśli lista pusta
            if (!flota.isEmpty()) {
                aktualnySamochod = flota.get(0);
                samochodComboBox.getSelectionModel().select(aktualnySamochod);
            } else {
                aktualnySamochod = null;
                samochodComboBox.getSelectionModel().clearSelection();
            }

            // Odśwież pola w UI
            refresh();
        }
    }

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

        samochodComboBox.getItems().addAll(flota);

        samochodComboBox.setOnAction(event -> {
            aktualnySamochod = samochodComboBox.getSelectionModel().getSelectedItem();
            refresh();
        });
        samochodComboBox.getSelectionModel().clearSelection();

        System.out.println("HelloController initialized");
        Image carImage = new Image(getClass().getResource("/wesole-auto-cars-samocho_8702.jpg").toExternalForm());
        System.out.println("Image width: " +
                carImage.getWidth() + ", height: " + carImage.getHeight());
        carImageView.setImage(carImage);
        carImageView.setFitWidth(50);
        carImageView.setFitHeight(50);
        carImageView.setTranslateX(0);
        carImageView.setTranslateY(0);

        mapa.setOnMouseClicked(event -> {
            double x = event.getX();
            double y = event.getY();
            Pozycja cel = new Pozycja(x, y);
            aktualnySamochod.jedzDo(cel);
        });
}
}

