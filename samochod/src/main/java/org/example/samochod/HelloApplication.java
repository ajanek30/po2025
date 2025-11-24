package org.example.samochod;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import symulator.*;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        ArrayList<Samochod> listaSamochodow = new ArrayList<>();

        //Komponent k1 = new Komponent("Volks","xxx","asc",22,33);
        Silnik silnik1 = new Silnik("Volkswagen","323kds",5000,"2.0TDI",350,3995,false);
        Sprzeglo sprzeglo1 = new Sprzeglo("Yomaha","FuryX","sprzeglo",344,2137,false);
        SkrzyniaBiegow skrzynia1 = new SkrzyniaBiegow("Hashimoto","322234",1,6,3,"skrzynia",150,1499,sprzeglo1,false);
        Pozycja pozycja1 = new Pozycja(1.0,1.0);

        Samochod autko1 = new Samochod("KK11223","Insignia",230,pozycja1,silnik1,skrzynia1);

        listaSamochodow.add(autko1);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        fxmlLoader.setControllerFactory(controllerClass -> {
            if (controllerClass == HelloController.class) {
                // Gdy FXMLLoader tworzy kontroler, użyjemy naszego niestandardowego konstruktora
                return new HelloController(listaSamochodow);
            } else {
                // Dla reszty klas użyjemy domyślnego konstruktora
                try {
                    return controllerClass.getDeclaredConstructor().newInstance();
                } catch (Exception e) {
                    throw new RuntimeException("Nie udało się utworzyć kontrolera", e);
                }
            }
        });

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
