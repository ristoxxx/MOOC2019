
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int luku = 0;

    while (true) {
        luku = luku + 1;

        if (luku >= 5) {
            break;
        }

        if (luku < 5) {
            continue;
        }

        System.out.print(luku + " ");
    }

    System.out.print(luku + " ");
}
    }
}
