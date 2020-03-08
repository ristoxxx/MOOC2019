package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HymioSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {

        Canvas piirtoalusta = new Canvas(640, 480);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();


        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(piirtoalusta);

        piirturi.fillRect(150, 50, 50, 50);
        piirturi.fillRect(300, 50, 50, 50);
        piirturi.fillRect(100, 200, 50, 50);
        piirturi.fillRect(150, 250, 50, 50);
        piirturi.fillRect(200, 250, 50, 50);
        piirturi.fillRect(250, 250, 50, 50);
        piirturi.fillRect(300, 250, 50, 50);
        piirturi.fillRect(350, 200, 50, 50);
        

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(HymioSovellus.class);
    }
}

