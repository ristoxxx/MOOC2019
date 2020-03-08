package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application{

  @Override
  public void start(Stage ikkuna) {

      Button ekaan = new Button("Ekaan näkymään!");
      Button tokaan = new Button("Tokaan näkymään!");
      Button kolmanteen = new Button("Kolmanteen näkymään!");

      
      BorderPane asettelu = new BorderPane();
      asettelu.setTop(new Label("Eka näkymä!"));
      asettelu.setCenter(tokaan);
      
      VBox tokanen = new VBox();
      tokanen.getChildren().add(kolmanteen);
      tokanen.getChildren().add(new Label("Toka näkymä!"));
      
      GridPane kolmonen = new GridPane();
      kolmonen.add(new Label("Kolmas näkymä!"), 0, 0);
      kolmonen.add(ekaan, 1, 1);
      
      Scene eka = new Scene(asettelu);
      Scene toka = new Scene(tokanen);
      Scene kolmas = new Scene (kolmonen);

      ekaan.setOnAction((event) -> {
          ikkuna.setScene(eka);
          ikkuna.setTitle("Eka näkymä!");
      });
      
      tokaan.setOnAction((event) -> {
          ikkuna.setScene(toka);
          ikkuna.setTitle("Toka näkymä!");
      });

      kolmanteen.setOnAction((event) -> {
          ikkuna.setScene(kolmas);
          ikkuna.setTitle("Kolmas näkymä!");
      });
      
      ikkuna.setScene(eka);
      ikkuna.setTitle("Eka näkymä!");
      ikkuna.show();
  }

  public static void main(String[] args) {
      launch(UseampiNakyma.class);
  }
}
