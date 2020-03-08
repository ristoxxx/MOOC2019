
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;

    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        Random arpoja = new Random();
        
        for (int i = 0; numerot.size() < 7; i++){
            int numero = 1 + arpoja.nextInt(40);
            if (!numerot.contains(numero)) {
                numerot.add(numero);
            }
        }
        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
    }

    public boolean sisaltaaNumeron(int numero) {
        if (numerot.contains(numero)) {
            return true;
        } else {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
            return false;
        }
    }
}
