
public class LukujenKeskiarvo {

    // toteuta tähän uudelleen aiemmin tekemäsi summametodi
    public static int summa(int luku1, int luku2, int luku3, int luku4) {
        int tulos = luku1+luku2+luku3+luku4;
        return tulos;
    }

    public static double keskiarvo(int luku1, int luku2, int luku3, int luku4) {
        int tulos = summa(luku1,luku2,luku3,luku4);
        double ka = 1.0*tulos/4;
        return ka;
        
    }

    public static void main(String[] args) {
        double vastaus = keskiarvo(4, 3, 6, 1);
        System.out.println("Keskiarvo: " + vastaus);
    }
}
