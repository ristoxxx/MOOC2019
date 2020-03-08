
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
        Lista<String> lista = new Lista<>();
        System.out.println(lista.sisaltaa("hei"));
        lista.lisaa("hei");
        System.out.println(lista.sisaltaa("hei"));
        int indeksi = lista.arvonIndeksi("hei");
        System.out.println(indeksi);
        System.out.println(lista.arvo(indeksi));
        lista.poista("hei");
        System.out.println(lista.sisaltaa("hei"));
    }

}
