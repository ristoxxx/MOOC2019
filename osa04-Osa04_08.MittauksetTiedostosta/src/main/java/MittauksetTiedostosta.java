
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

        // luetaan tiedostoja kunnes kaikki rivit on luettu
        while (tiedostonLukija.hasNextLine()) {
            // luetaan yksi rivi
            String rivi = tiedostonLukija.nextLine();
            // tulostetaan luettu rivi
            lista.add(Integer.valueOf(rivi)) ;
        }   
            
        int lukuja = 0;
        for (Integer luku: lista) {
            if (luku <= ylaraja && luku >= alaraja) {
                lukuja++;
            }
        }
            System.out.println("Lukuja: " + lukuja);
        } catch (Exception e) {
        System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        
        System.out.println(e.getMessage());
        }

    }

}
