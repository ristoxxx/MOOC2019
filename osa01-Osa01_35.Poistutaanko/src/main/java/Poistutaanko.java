
import java.util.Scanner;

public class Poistutaanko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
        System.out.println("Poistutaanko?");
        String vastaus = lukija.nextLine();
        if (vastaus.equals("kyllä")) {
        break;
    }

    System.out.println("Ok! Jatketaan!");
}

System.out.println("Valmista!");
    }
}
