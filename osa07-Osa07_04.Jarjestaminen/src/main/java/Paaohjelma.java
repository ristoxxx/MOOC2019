
public class Paaohjelma {

    public static void main(String[] args) {
        
        int[] taulukko = {3, 1, 5, 99, 3, 12};

        
        // tee testikoodia tänne
        
    }
    
    public static int pienin(int[] taulukko) {
            
            int pienin = taulukko[0];

            int indeksi = 0;
            while (indeksi < taulukko.length) {
                int luku = taulukko[indeksi];
                if (pienin > luku) {
                    pienin = luku;
                }

                indeksi = indeksi + 1;
            }
            return pienin;
    }
    
    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = taulukko[0];
        int pienimmanIndeksi = 0;
        int indeksi = 0;
        while (indeksi < taulukko.length) {
            int luku = taulukko[indeksi];
            if (pienin > luku) {
                pienin = luku;
                pienimmanIndeksi = indeksi;
            }

            indeksi = indeksi + 1;
        }
        return pienimmanIndeksi;
        
    }
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int pienin = taulukko[aloitusIndeksi];
        int pienimmanIndeksi = aloitusIndeksi;
        int indeksi = aloitusIndeksi;
        while (indeksi < taulukko.length) {
            int luku = taulukko[indeksi];
            if (pienin > luku) {
                pienin = luku;
                pienimmanIndeksi = indeksi;
            }

            indeksi = indeksi + 1;
        }
        return pienimmanIndeksi;
        
    }
    
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int apu = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = apu;
    }
    
    public static void jarjesta(int[] taulukko) {
        int laskuri = 0;
        while (laskuri < taulukko.length) {
            System.out.println(taulukko);
            int ekaVaihdokas = pienimmanIndeksiAlkaen(taulukko, laskuri);
            int tokaVaihdokas = laskuri;
            vaihda(taulukko, ekaVaihdokas, tokaVaihdokas);
            
            laskuri++;
        }
        
    }
}

