
import java.util.Objects;

public class Henkilo {

    private String nimi;
    private Paivays syntymaPaiva;
    private int pituus;
    private int paino;

    public Henkilo(String nimi, Paivays syntymaPaiva, int pituus, int paino) {
        this.nimi = nimi;
        this.syntymaPaiva = syntymaPaiva;
        this.pituus = pituus;
        this.paino = paino;
    }
    
    public String getNimi() {
        return this.nimi;
    }

    public int getPituus() {
        return this.pituus;
    }
    
    public int getPaino() {
        return this.paino;
    }
            
    
    
    @Override
    public boolean equals(Object verrattava) {
        Henkilo verrattavaHenkilo = (Henkilo) verrattava;
        if (this.nimi.equals(verrattavaHenkilo.nimi) &&
            this.syntymaPaiva.equals(verrattavaHenkilo.syntymaPaiva) &&
            this.paino == verrattavaHenkilo.paino &&
            this.pituus == verrattavaHenkilo.pituus) {
            return true;
//        if (this.nimi.equals(verrattava) && this.pituus) {
        
//        return true;
        } else {
            return false;
        }
    }

    // toteuta tänne equals-metodi, jolla tarkastellaan olioiden samuutta
}
