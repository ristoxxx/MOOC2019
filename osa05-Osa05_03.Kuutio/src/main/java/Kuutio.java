/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Kuutio {
    private int sarma;
    
    public Kuutio(int sarmanPituus) {
        this.sarma = sarmanPituus;
        
    }
    
    public int tilavuus() {
        return sarma * sarma * sarma;
    }
    
    public String toString() {
        return "Kuution särmän pituus on " + sarma +", tilavuus on "+ tilavuus();
    }
}
