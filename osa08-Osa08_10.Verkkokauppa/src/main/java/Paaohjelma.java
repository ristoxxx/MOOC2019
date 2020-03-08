

public class Paaohjelma {

    public static void main(String[] args) {
        Ostoskori kori = new Ostoskori();
        kori.lisaa("maito", 3);
        kori.lisaa("maito", 3);
        kori.lisaa("piima", 2);
        kori.lisaa("juusto", 5);
        System.out.println("korin hinta: " + kori.hinta());
        kori.lisaa("tietokone", 899);
        kori.lisaa("maito", 3);
        System.out.println("korin hinta: " + kori.hinta());
        // tee tänne testikoodia
    }
}
