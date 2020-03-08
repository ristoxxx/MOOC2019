
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Putki<T> {
    
    ArrayList<T> putki;
    
    public Putki() {
        this.putki = new ArrayList<>();
    }
    
    public void lisaaPutkeen(T arvo) {
        this.putki.add(arvo);
    }
        //lisää putkeen luokan tyyppiparametrin mukaisen olion.
    public T otaPutkesta() {
        return this.putki.get(this.putki.size());
                
    }
//ottaa putkesta siellä pisimpään olleen arvon. Mikäli putkessa ei ole mitään, palautetaan null. Metodin kutsuminen palauttaa putkessa pisimpään olleen olion ja poistaa sen putkesta.
    public boolean onkoPutkessa() {
        if (putki.isEmpty()) {
            return false;
        } else {
            return true;
        }
        
    }
//palauttaa arvon true mikäli putkessa on arvoja. Mikäli putki on tyhjä, palauttaa arvon false.
    
}
