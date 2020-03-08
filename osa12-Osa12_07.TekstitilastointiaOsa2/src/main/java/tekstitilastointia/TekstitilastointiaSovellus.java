package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TekstitilastointiaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();
        TextArea teksti = new TextArea("");
        asettelu.setCenter(teksti);
     //   int merkkeja = 0;
     //   int sanoja = 0;
        teksti.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
        int merkkeja = uusiArvo.length();
        String[] palat = uusiArvo.split(" ");
        int sanoja = palat.length;
        String pisin = Arrays.stream(palat)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .findFirst()
            .get();
     
        
        Label kirjaimia = new Label("Kirjaimia: " + merkkeja);
        Label sanat = new Label("Sanoja: " + sanoja);
        Label pisinSana = new Label("Pisin sana on: " + pisin);

        HBox tekstit = new HBox();
        tekstit.setSpacing(10);
        tekstit.getChildren().add(kirjaimia);
        tekstit.getChildren().add(sanat);
        tekstit.getChildren().add(pisinSana);
        
        asettelu.setBottom(tekstit);
        
        
        
        
        // asetetaan arvot tekstielementteihin
//    });
        
        
        
        });

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    };

    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }
}
