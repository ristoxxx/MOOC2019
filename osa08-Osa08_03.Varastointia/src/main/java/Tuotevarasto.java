/**
 *
 * @author Evermore
 */
public class Tuotevarasto extends Varasto {
    
    private String nimi;
    
    
    
    public Tuotevarasto(String tuotenimi, double tilavuus) {
            super(tilavuus);
            this.nimi = tuotenimi;        
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public String toString() {
        return this.getNimi() +": saldo = " + super.getSaldo() + ", tilaa " + super.paljonkoMahtuu();
    }
    
    
}
