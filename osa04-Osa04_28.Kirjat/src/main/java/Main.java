
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirjat> niteet = new ArrayList<>();
        
        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            }
            System.out.print("Sivuja: ");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.print("Julkaisuvuosi: ");
            int julkaisuvuosi = Integer.valueOf(lukija.nextLine());
            
            niteet.add(new Kirjat(nimi, sivuja, julkaisuvuosi));
        }
        
        System.out.print("Mitä tulostetaan? ");
        String tulostus = lukija.nextLine();
        if (tulostus.equals("kaikki")) {
            System.out.println(niteet);        
        } else if (tulostus.equals("nimi")) {
            for (Kirjat kirja: niteet) {
//            if (kirja.getNimi() <= Integer.valueOf(maxPituus)) {
                System.out.println(kirja.getNimi());
            }
        }
        
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä

    }
}
