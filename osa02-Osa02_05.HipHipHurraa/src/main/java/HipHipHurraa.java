
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //aloitetaan silmukka
        while (true){
            //luetaan käyttäjältä syöte muuttujaan teksti
            String teksti = lukija.nextLine();
            //suoritetaan vertailu, tulostetaan "hip" ja jatketaan silmukka 
            //jos teksti muuta kuin "lopeta".
            //jos teksksti on "lopeta" tulostetaan 
            //"hurraa!" ja poistutaan silmukasta.
            if (teksti.equals("lopeta")) {
                System.out.println("hurraa!");
                break;
            } else {
                System.out.println("hip!");
            }
        }
        
    }
}
