package otsikko;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä otsikko: ");
        String otsikko = lukija.nextLine();
        Application.launch(KayttajanOtsikko.class,
            "--organisaatio=" + otsikko);
    }
}
