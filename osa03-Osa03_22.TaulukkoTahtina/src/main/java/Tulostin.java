
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) { 
        int indeksi = 0;
        int tahtia = 0;
        
        while (indeksi < taulukko.length) { 
            tahtia = taulukko[indeksi];
            while (tahtia > 0) {
                System.out.print("*");
                tahtia--;
            }
            System.out.println("");
            indeksi++;
        }
             
        // Kirjoita tulostuskoodi tänne
    }
    

}
