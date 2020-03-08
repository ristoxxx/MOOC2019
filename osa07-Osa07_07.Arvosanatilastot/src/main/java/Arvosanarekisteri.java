
import java.util.HashMap;

public class Arvosanarekisteri {

    private HashMap<Integer, Integer> arvosanat;
    private Integer pisteetYhteensa;
    private Integer pisteetLukumaara;
    private Integer summaArvosanat;
    private Integer hyvaksytytYhteensa;
    private Integer hyvaksytytLukumaara;

    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
        this.pisteetYhteensa = 0;
        this.pisteetLukumaara = 0;
        this.summaArvosanat = 0;
        this.hyvaksytytLukumaara = 0;
        this.hyvaksytytYhteensa = 0;
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        int arvosana = pisteetArvosanaksi(pisteet);

        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
        
        this.pisteetYhteensa = this.pisteetYhteensa + pisteet;
        this.pisteetLukumaara = this.pisteetLukumaara + 1;
        if (pisteet >= 50) {
            this.hyvaksytytYhteensa = this.hyvaksytytYhteensa + pisteet;
            this.hyvaksytytLukumaara = this.hyvaksytytLukumaara + 1;            
        }
    }

    public double koepisteidenKeskiarvo() {
        return 1.0 * this.pisteetYhteensa / this.pisteetLukumaara;
        
    }
    
    public double hyvaksyttyjenKeskiarvo() {
        return 1.0 * this.hyvaksytytYhteensa / this.hyvaksytytLukumaara;
        
    }
    
    public double hyvaksymisProsentti() {
        return 100 / 1.0 * this.hyvaksytytLukumaara / this.pisteetLukumaara;
    }
    
    public double arvosanojenKeskiarvo() {
        int laskuri = 5;
        while (laskuri > 0) { 
        int arvoSana = montakoSaanutArvosanan(laskuri);
        this.summaArvosanat = this.summaArvosanat + laskuri * arvoSana;
        laskuri--;
        }
        return 1.0 * this.summaArvosanat / this.pisteetLukumaara;
    }
    
    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }


    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
}

