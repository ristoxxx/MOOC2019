/**
 *
 * @author Evermore
 */
public class MuistavaTuotevarasto extends Tuotevarasto {

    private Muutoshistoria muutoshistoria;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.muutoshistoria = new Muutoshistoria();
        this.muutoshistoria.lisaa(alkuSaldo);
    }
    
    @Override
    public void lisaaVarastoon(double maara) {
        if (maara < 0) {
            return;
        }
        if (maara <= paljonkoMahtuu()) {            
            super.lisaaVarastoon(maara);
            this.muutoshistoria.lisaa(super.getSaldo());
        } 
    }
    
    public double otaVarastosta(double maara) {
        if (maara < 0) {
            return 0.0;
        }
        if (maara > super.getSaldo()) {
            double kaikkiMitaVoidaan = super.getSaldo();
            super.otaVarastosta(kaikkiMitaVoidaan);
            this.muutoshistoria.lisaa(super.getSaldo());
            return kaikkiMitaVoidaan;
        }
        super.otaVarastosta(maara);
        this.muutoshistoria.lisaa(super.getSaldo());
        return maara;
    }
    
    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + super.getNimi());
        System.out.println("Historia: " + historia());
        System.out.println("Suurin tuotemäärä: " + this.muutoshistoria.maxArvo());
        System.out.println("Pienin tuotemäärä: " + this.muutoshistoria.minArvo());
        System.out.println("Keskiarvo: " + this.muutoshistoria.keskiarvo());        
    }
    
    public String historia() {
        return this.muutoshistoria.toString();
    }
    
    
    
}