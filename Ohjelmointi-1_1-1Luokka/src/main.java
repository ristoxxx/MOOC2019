import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
    
        Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("opintopisteitä " + olli.opintopisteita());

        olli.opiskele();

        System.out.println("opintopisteitä " + olli.opintopisteita());

        

    }
}
