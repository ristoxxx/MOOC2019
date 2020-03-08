package ilmoitin;
import javafx.scene.control.TextField;
//import java.awt.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IlmoitinSovellus extends Application{
    
    @Override
    public void start(Stage ikkuna) {
    TextField vasenTeksti = new TextField("");
    Label oikeaTeksti = new Label("teksti");
    Button nappi = new Button("Kopioi");

    VBox komponenttiryhma = new VBox();
    komponenttiryhma.setSpacing(10);
    komponenttiryhma.getChildren().addAll(vasenTeksti, nappi, oikeaTeksti);
    
    nappi.setOnAction((event) -> {
        oikeaTeksti.setText(vasenTeksti.getText());
    });

    Scene nakyma = new Scene(komponenttiryhma);

    ikkuna.setScene(nakyma);
    ikkuna.show();
    }
}