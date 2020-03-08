package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage ikkuna) {
    // luodaan kaaviossa käytettävät x- ja y-akselit
    NumberAxis xAkseli = new NumberAxis(2007, 2017, 1);
    NumberAxis yAkseli = new NumberAxis(0, 100, 1);

    // asetetaan akseleille nimet
    xAkseli.setLabel("Vuosi");
    yAkseli.setLabel("Sijoitus");

    // luodaan viivakaavio. Viivakaavion arvot annetaan numeroina
    // ja se käyttää aiemmin luotuja x- ja y-akseleita
    LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
    viivakaavio.setTitle("Helsingin yliopisto, Sanghai-ranking");

    // luodaan viivakaavioon lisättävä datajoukko
    XYChart.Series hyData = new XYChart.Series();
//    hyData.setName("RKP");
    // lisätään datajoukkoon yksittäisiä pisteitä
    hyData.getData().add(new XYChart.Data(2007, 73));
    hyData.getData().add(new XYChart.Data(2008, 68));
    hyData.getData().add(new XYChart.Data(2009, 72));
    hyData.getData().add(new XYChart.Data(2010, 72));
    hyData.getData().add(new XYChart.Data(2011, 74));
    hyData.getData().add(new XYChart.Data(2012, 73));
    hyData.getData().add(new XYChart.Data(2013, 76));
    hyData.getData().add(new XYChart.Data(2014, 73));
    hyData.getData().add(new XYChart.Data(2015, 67));
    hyData.getData().add(new XYChart.Data(2016, 56));
    hyData.getData().add(new XYChart.Data(2017, 56));

    // lisätään datajoukko viivakaavioon
    viivakaavio.getData().add(hyData);

    // näytetään viivakaavio
    Scene nakyma = new Scene(viivakaavio, 640, 480);
    ikkuna.setScene(nakyma);
    ikkuna.show();
}
}
