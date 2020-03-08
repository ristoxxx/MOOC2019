
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna pisteet[0-100]");
        
        int pisteet = Integer.valueOf(lukija.nextLine());
        int arvosana = 0;
        if (pisteet >= 90) {
            arvosana = 5;
        } else if (pisteet >=80){
            arvosana = 4;
        } else if (pisteet >=70){
            arvosana = 3;
        } else if (pisteet >=60){
            arvosana = 2;
        } else if (pisteet >=50){
            arvosana = 1;
        }
       
        if (pisteet < 0) {
            System.out.println("Arvosana:Mahdotonta!");
        } else if (pisteet > 100) {
            System.out.println("Arvosana:Uskomatonta!");
        } else if (pisteet <=49) {
            System.out.println("Arvosana:Hylätty");
        } else {
            System.out.println("Arvosana:" + arvosana);
        }
    }
}
