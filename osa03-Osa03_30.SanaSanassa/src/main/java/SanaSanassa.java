
import java.util.Scanner;

public class SanaSanassa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna 1. sana: ");
        String sana = String.valueOf(lukija.nextLine());
        
        System.out.print("Anna 2. sana: ");
        String toinenSana = String.valueOf(lukija.nextLine());

        int indeksi = sana.indexOf(toinenSana); //indeksin arvoksi tulee 1
        if (indeksi != -1) {
            System.out.println("Sana '" + toinenSana + "' on sanan '" + sana + "' osana.");
        } else {
            System.out.println("Sana '" + toinenSana + "' ei ole sanan '" + sana + "' osana.");
        }
        
        
    }
}
