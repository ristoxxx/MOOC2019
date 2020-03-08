
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
      
        Scanner lukija = new Scanner(System.in);
        
        int parittomia = -1;
        int parillisia = 0;
        int lukuja = -1;
        int summa = 0;
        int luku = 0;
        System.out.println("Syötä luvut: ");
        
        while (luku != -1) {                    
            
            lukuja++;
            summa = summa + luku;
            luku = Integer.valueOf(lukija.nextLine());      
            if (luku%2 == 0) {
                parillisia++;
            } else {
                parittomia++;
            }
        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("summa on: " + summa);
        System.out.println("Lukuja: " + lukuja);
        System.out.println("Keskiarvo: " + (1.0*summa/lukuja));
        System.out.println("Parillisia: " + parillisia);
        System.out.println("Parittomia: " + parittomia);

    }
}
