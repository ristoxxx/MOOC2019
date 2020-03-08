
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> syotteet = new ArrayList<>();

        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        // luetaan syotteet
        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
            }

            syotteet.add(rivi);
        }
        
        while (true) {
            System.out.print("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
            String rivi = lukija.nextLine();
            if (rivi.equals("n")) {
                double keskiarvo = syotteet.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku <= 0)
                .average()
                .getAsDouble();
                System.out.println("Negatiivisten lukujen keskiarvo:" + keskiarvo);
                break;
            } else if (rivi.equals("p")) {
                double keskiarvo = syotteet.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku >= 0)
                .average()
                .getAsDouble();
                System.out.println("Positiivisten lukujen keskiarvo:" + keskiarvo);
                break;
                
            }

            
        }
        
        
        // selvitetään kolmella jaollisten lukumaara
        long kolmellaJaollistenLukumaara = syotteet.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(luku -> luku % 3 == 0)
            .count();

        // selvitetään keskiarvo
        double keskiarvo = syotteet.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();

        // tulostetaan tilastot
        System.out.println("Kolmella jaollisia: " + kolmellaJaollistenLukumaara);
        System.out.println("Lukujen keskiarvo: " + keskiarvo);
        // toteuta ohjelmasi tänne

    }
}
