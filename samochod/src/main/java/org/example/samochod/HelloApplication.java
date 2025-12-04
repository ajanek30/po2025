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
//        ma konkretny cel: pozwala na stworzenie instancji kontrolera HelloController z własnym konstruktorem, który przyjmuje listę samochodów (ArrayList<Samochod> listaSamochodow).
//
//                Normalnie, JavaFX przy ładowaniu FXML tworzy kontroler przy pomocy domyślnego konstruktora bez parametrów. Problem jest taki: Twój HelloController nie ma domyślnego konstruktora – on wymaga listy samochodów.
//
//        Dlatego musisz użyć setControllerFactory, żeby powiedzieć FXMLLoaderowi:
//
//        jeśli chcemy HelloController, to stwórz go z tą konkretną listą samochodów;
//
//        jeśli inny kontroler, użyj standardowego konstruktora.
//
//        Bez tego JavaFX rzuciłby wyjątek typu InstantiationException, bo nie umie stworzyć kontrolera bezpłatnie.
//
//💡 W skrócie: pozwala wstrzyknąć własną listę samochodów do kontrolera przy starcie aplikacji.
//
//        Mogę pokazać Ci też prostszy sposób, jeśli chcesz, żeby kontroler był tworzony domyślnie i potem tylko inicjalizował listę w initialize(). Chcesz, żebym to zrobił?

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
