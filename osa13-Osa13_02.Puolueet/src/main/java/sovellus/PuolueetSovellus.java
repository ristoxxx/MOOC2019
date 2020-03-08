package sovellus;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PuolueetSovellus extends Application{
    
    @Override
    public void start(Stage ikkuna) {
    List<String[]> rivit = new ArrayList<>();
        try {
            Files.lines(Paths.get("puoluedata.tsv")).map(line -> line.split("\t")).forEach(rivi -> rivit.add(rivi));
        } catch (IOException ex) {
            System.out.println("Tiedoston \"puoluedata.tsv\" lukeminen epäonnistui.");
            return;
        }    
    // luodaan kaaviossa käytettävät x- ja y-akselit
    NumberAxis xAkseli = new NumberAxis(1968, 2008, 1);
    NumberAxis yAkseli = new NumberAxis();

    // asetetaan akseleille nimet
    xAkseli.setLabel("Vuosi");
    yAkseli.setLabel("Suhteellinen kannatus (%)");

    // luodaan viivakaavio. Viivakaavion arvot annetaan numeroina
    // ja se käyttää aiemmin luotuja x- ja y-akseleita
    LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
    viivakaavio.setTitle("Suhteellinen kannatus vuosina 1968-2008");
    
    Map<String, Map<Integer, Double>> arvot = new HashMap<>();
    Map<Integer, Double> vuodetjaluvut = new HashMap<>();
    
    for (int i = 1; i < rivit.size(); i++) {
            String[] rivi = rivit.get(i);

            XYChart.Series data = new XYChart.Series();
            data.setName(rivi[0]);

            for (int sarake = 1; sarake < rivi.length; sarake++) {
                String arvo = rivi[sarake];
                if (arvo.equals("-")) {
                    continue;
                }

                int vuosi = Integer.parseInt(rivit.get(0)[sarake]);
                data.getData().add(new XYChart.Data(vuosi, Double.parseDouble(arvo)));
            }

            viivakaavio.getData().add(data);

        }

    Scene nakyma = new Scene(viivakaavio, 640, 480);
    ikkuna.setScene(nakyma);
    ikkuna.show();
}

    public static void main(String[] args) {
        launch(args);
    }
}    