
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> syotteet = new ArrayList<>();

        // luetaan syotteet
        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
            }

            syotteet.add(rivi);
        }

        double keskiarvo = syotteet.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();

        System.out.println("Lukujen keskiarvo: " + keskiarvo);
        // toteuta ohjelmasi tänne

    }
}
