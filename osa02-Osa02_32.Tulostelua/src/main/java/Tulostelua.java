
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        int laskuri = 0;
        while  (laskuri<maara) {
            System.out.print("*");
            laskuri++;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        int laskuri = 0;
        while (laskuri<sivunpituus) {
            tulostaTahtia(sivunpituus);
            laskuri++;
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        int laskuri = 0;
        while (laskuri<korkeus) {
            tulostaTahtia(leveys);
            laskuri++;
        }
    }

    public static void tulostaKolmio(int koko) {
        int laskuri = 1;
        while (laskuri<=koko) {
            tulostaTahtia(laskuri);
            laskuri++;
        }
    }
}
