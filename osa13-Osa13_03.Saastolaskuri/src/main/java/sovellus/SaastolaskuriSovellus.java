package sovellus;

import javafx.geometry.Insets;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class SaastolaskuriSovellus extends Application{
    
    @Override
    public void start(Stage ikkuna) {
        
        BorderPane asettelu = new BorderPane();
        
        Slider ekaSlider = new Slider();
        ekaSlider.setMin(25);
        ekaSlider.setMax(250);
        ekaSlider.setValue(25);
        ekaSlider.setShowTickLabels(true);
        ekaSlider.setShowTickMarks(true);
//        ekaSlider.setMajorTickUnit(25);
//        ekaSlider.setMinorTickCount(5);
        ekaSlider.setBlockIncrement(500);
        ekaSlider.setSnapToTicks(true);
        
        Slider tokaSlider = new Slider();
        tokaSlider.setMin(0);
        tokaSlider.setMax(10);
        tokaSlider.setValue(10);
        tokaSlider.setShowTickLabels(true);
        tokaSlider.setShowTickMarks(true);
//        tokaSlider.setMajorTickUnit(10);
        tokaSlider.setMinorTickCount(10);
//        tokaSlider.setBlockIncrement(1);

        Label ekaSliderTeksti = new Label("25");
        Label korkoTeksti = new Label("0");
            
        BorderPane talletus = new BorderPane();
        talletus.setLeft(new Label("Kuukausittainen tallennus"));
        talletus.setCenter(ekaSlider);
        talletus.setRight(ekaSliderTeksti);
        talletus.setPadding(new Insets(10));
        
        BorderPane korko = new BorderPane();
        korko.setLeft(new Label("Vuosittainen korko"));
        korko.setCenter(tokaSlider);
        korko.setRight(korkoTeksti);
        ekaSlider.setPadding(new Insets(10));
        
        VBox tekstit = new VBox();
        
        tekstit.getChildren().add(talletus);
        tekstit.getChildren().add(korko);
        
        tekstit.setPadding(new Insets(10)); 
        tekstit.setSpacing(10);
                
        asettelu.setTop(tekstit);

        NumberAxis xAkseli = new NumberAxis(0, 30, 1);
        NumberAxis yAkseli = new NumberAxis();
 
        LineChart<Number, Number> lineChart = new LineChart<>(xAkseli, yAkseli);
        lineChart.setAnimated(false);
        lineChart.setLegendVisible(false);
        lineChart.setTitle("Säästölaskuri");
        
        
        XYChart.Series saastot = new XYChart.Series();
        XYChart.Series saastotKoroilla = new XYChart.Series();
 
        lineChart.getData().add(saastot);
        lineChart.getData().add(saastotKoroilla);
        
        asettelu.setCenter(lineChart);
 
        ekaSlider.setOnMouseReleased(e -> {
            ekaSliderTeksti.setText("" + ekaSlider.getValue());
            paivitaKaavio(ekaSlider.getValue(), tokaSlider.getValue(), saastot, saastotKoroilla);
        });
 
        korko.setOnMouseReleased(e -> {
 
            String korkoString = "" + tokaSlider.getValue();
            if (korkoString.length() > 4) {
                korkoString = korkoString.substring(0, 4);
            }
            korkoTeksti.setText(korkoString);
            paivitaKaavio(ekaSlider.getValue(), tokaSlider.getValue(), saastot, saastotKoroilla);
        });
 
        Scene nakyma = new Scene(asettelu, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
 
    private void paivitaKaavio(double kuukausiSaasto, double korko, XYChart.Series saastot, XYChart.Series saastotKoroilla) {
        saastot.getData().clear();
        saastotKoroilla.getData().clear();
 
        saastot.getData().add(new XYChart.Data(0, 0));
        saastotKoroilla.getData().add(new XYChart.Data(0, 0));
 
        double edellinen = 0;
 
        for (int i = 1; i <= 30; i++) {
            saastot.getData().add(new XYChart.Data(i, i * kuukausiSaasto * 12));
 
            edellinen += kuukausiSaasto * 12;
            edellinen *= (1 + korko / 100.0);
 
            saastotKoroilla.getData().add(new XYChart.Data(i, edellinen));
        }
    }
 
    public static void main(String[] args) {
        launch(SaastolaskuriSovellus.class);
    }
 
}