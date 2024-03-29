package kollaasi;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class KollaasiSovellus extends Application {

    @Override
    public void start(Stage stage) {

        // esimerkki avaa kuvan, luo uuden kuvan, ja kopioi avatun kuvan 
        // uuteen kuvaan pikseli kerrallaan
        Image lahdeKuva = new Image("file:monalisa.png");

        PixelReader kuvanLukija = lahdeKuva.getPixelReader();

        int leveys = (int) lahdeKuva.getWidth();
        int korkeus = (int) lahdeKuva.getHeight();

        WritableImage kohdeKuva = new WritableImage(leveys, korkeus);
        PixelWriter kuvanKirjoittaja = kohdeKuva.getPixelWriter();

        int yKoordinaatti = 0;
        while (yKoordinaatti < korkeus) {
            int xKoordinaatti = 0;
            while (xKoordinaatti < leveys) {

                Color vari = kuvanLukija.getColor(xKoordinaatti, yKoordinaatti);
                double punainen = vari.getRed();
                double vihrea = vari.getGreen();
                double sininen = vari.getBlue();
                double lapinakyvyys = vari.getOpacity();

                Color uusiVari = new Color(1 - punainen, 1 -  vihrea, 1 - sininen, lapinakyvyys);

//                kuvanKirjoittaja.setColor(xKoordinaatti, yKoordinaatti, uusiVari);
                int uusixKoordinaatti = xKoordinaatti / 2;
                int uusiyKoordinaatti = yKoordinaatti / 2;
                kuvanKirjoittaja.setColor(uusixKoordinaatti, uusiyKoordinaatti, uusiVari);
                uusixKoordinaatti = (leveys / 2) + (xKoordinaatti / 2);
                uusiyKoordinaatti = yKoordinaatti / 2;
                kuvanKirjoittaja.setColor(uusixKoordinaatti, uusiyKoordinaatti, uusiVari);
                uusixKoordinaatti = xKoordinaatti / 2;
                uusiyKoordinaatti = (korkeus / 2) + (yKoordinaatti / 2);
                kuvanKirjoittaja.setColor(uusixKoordinaatti, uusiyKoordinaatti, uusiVari);
                uusixKoordinaatti = (leveys / 2) + (xKoordinaatti / 2);
                uusiyKoordinaatti = (korkeus / 2) + (yKoordinaatti / 2);
                kuvanKirjoittaja.setColor(uusixKoordinaatti, uusiyKoordinaatti, uusiVari);

                xKoordinaatti += 2;
            }

            yKoordinaatti += 2;
            
        }
        
        

        ImageView kuva = new ImageView(kohdeKuva);

        Pane pane = new Pane();
        pane.getChildren().add(kuva);

        stage.setScene(new Scene(pane));
        stage.show();
        System.out.println(kuvanLukija.getColor(0, 249));
    }

    public static void main(String[] args) {
        launch(args);
    }

}
