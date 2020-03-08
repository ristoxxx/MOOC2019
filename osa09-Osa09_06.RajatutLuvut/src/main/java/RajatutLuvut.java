
import java.util.ArrayList;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> syotteet = new ArrayList<>();

        while (true) {
            int rivi = Integer.valueOf(lukija.nextLine());
            if (rivi < 0) {
                break;
            }

            syotteet.add(rivi);
        }

        syotteet.stream()
            .filter(luku -> luku <= 5 && luku >= 1)
            .forEach(rivi -> System.out.println(rivi));

    }
}
