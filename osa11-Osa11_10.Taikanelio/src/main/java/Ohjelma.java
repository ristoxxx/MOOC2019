
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa Taikanelio-luokkaasi täällä

        Taikaneliotehdas tt = new Taikaneliotehdas();
        System.out.println(tt.luoTaikanelio(5));
        Taikanelio nelio = new Taikanelio(4);
        System.out.println(nelio.lavistajienSummat());
        
    }
}
