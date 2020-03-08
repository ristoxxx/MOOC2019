
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
        
        ArrayList<Lintu> linnut = new ArrayList<>();
        
        while (true) {
            System.out.print("?");
            String komento = lukija.nextLine();
            if (komento.equals("Lopeta")) {
                break;
            }

            if (komento.equals("Lisaa")) {
                System.out.print("Nimi: ");
                String uusiNimi = lukija.nextLine();
                System.out.print("Latinankieleinen nimi: ");
                String uusiLatNimi = lukija.nextLine();
                Lintu lintu = new Lintu(uusiNimi, uusiLatNimi);
                linnut.add(lintu);
            }

            if (komento.equals("Havainto")) {
                System.out.print("Mikä havaittu? ");
                String havaittu = lukija.nextLine();
                    for (Lintu lintu : linnut) {
                        if (lintu.nimiSisaltaa(havaittu)) {
                            lintu.lisaaHavainto();
                        }
                    }  
            }

            if (komento.equals("Tilasto")) {
                
                for (Lintu lintu : linnut) {
                    System.out.println(lintu);
                }
            }

            if (komento.equals("Nayta")) {
                System.out.print("Mikä? ");
                String luettu = lukija.nextLine();
                    for (Lintu lintu : linnut) {
                        if (lintu.nimiSisaltaa(luettu)) {
                            System.out.println(lintu);;
                        }                    
                    }                
            }
        }
    }

}
