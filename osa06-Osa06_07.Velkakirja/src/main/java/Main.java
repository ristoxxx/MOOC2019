
public class Main {

    public static void main(String[] args) {
        Velkakirja matinVelkakirja = new Velkakirja();
        matinVelkakirja.asetaLaina("Arto", 51.5);
        matinVelkakirja.asetaLaina("Mikael", 30);

        System.out.println(matinVelkakirja.paljonkoVelkaa("Arto"));
        System.out.println(matinVelkakirja.paljonkoVelkaa("Joel"));
        // Testaa ohjelmaasi täällä
    }
}
