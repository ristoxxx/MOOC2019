
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        int laskuri = 0;
        while  (laskuri<maara) {
            System.out.print("*");
            laskuri++;
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        int laskuri = 0;
        while  (laskuri<maara) {
            System.out.print(" ");
            laskuri++;
        }
    }

    public static void tulostaKolmio(int koko) {
        int laskuri = 0;
        int laskuri2 = koko;
        while (laskuri<koko) {
            laskuri++;
            laskuri2--;
            tulostaTyhjaa(laskuri2);
            tulostaTahtia(laskuri);
        }
    }

    public static void jouluKuusi(int korkeus) {
        
        int laskuri = 0;
        int laskuri2 = korkeus;
        int laskuri3 = 0;
        while (laskuri3<korkeus) {
            laskuri++;
            laskuri2--;
            tulostaTyhjaa(laskuri2);
            tulostaTahtia(laskuri);
            laskuri++;
            laskuri3++;
        }
        tulostaTyhjaa(korkeus-2);
        tulostaTahtia(3);
        tulostaTyhjaa(korkeus-2);
        tulostaTahtia(3);
              
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(7);
    }
}
