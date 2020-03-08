
public class Ohjelma {

    public static void main(String[] args) {
        int rivit = 2;
        int sarakkeet = 3;
        int[][] matriisi = new int[rivit][sarakkeet];
        matriisi[0][1] = 5;
        matriisi[1][0] = 3;
        matriisi[1][2] = 7;
        System.out.println(taulukkoMerkkijonona(matriisi));
        // Testaa metodiasi täällä
    }
    
    public static String taulukkoMerkkijonona(int[][] taulukko) {
    
    int[][] nelio = taulukko;
    StringBuilder palautus = new StringBuilder();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                palautus.append(nelio[rivi][sarake]);//.append("\t");
            }

            palautus.append("\n");
        }

        return palautus.toString();
//    StringBuilder tuloste = new StringBuilder();
//    tuloste.append("rivi, sarake, arvo");
//    for (int rivi = 0; rivi < kaksiulotteinenTaulukko.length; rivi++) {
//        for (int sarake = 0; sarake < kaksiulotteinenTaulukko[sarake].length; sarake++) {
//            int arvo = kaksiulotteinenTaulukko[rivi][sarake];
//            tuloste.append("").append(rivi).append(", ").append(sarake).append(", ").append(arvo);
//        }
//       
//    }
//        System.out.println(tuloste.toString());
//    return tuloste.toString(); 
    }
    
}