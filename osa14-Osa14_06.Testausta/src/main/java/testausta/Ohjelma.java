package testausta;

import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
//        suorita(lukija);
        System.out.println(Ohjelma.suorita(new Scanner("3\n2\n1\n-1\n")));
    }

    public static String suorita(Scanner lukija) {
        int oppilaat = 0;
        int pullot = 0;
        double keskiarvo;
        System.out.println("Syötä oppilaskohtaiset pullomäärät rivinvaihdolla eroteltuna");
        System.out.println("-1 lopettaa tietojen syötön");
        int syote = 1;
        while (syote != -1) {
            syote = Integer.valueOf(lukija.nextLine());
            if (syote > 0) {
                pullot = pullot + syote;
                oppilaat++;
            }    
            }
        keskiarvo = pullot / oppilaat;        
        return ("Pulloja " + pullot + "\n" + "Oppilaita "+ oppilaat + "\n" + "Keskiarvo " + keskiarvo);
    }
}
