/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Evermore
 */
public class Keskiarvosensori implements Sensori {
    
    private ArrayList<Sensori> sensorit;
    private List<Integer> mittaukset;

    
    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.mittaukset = new ArrayList<>();
    }
    
    public void lisaaSensori(Sensori lisattava) {
        sensorit.add(lisattava);
        
    }
    
    public List<Integer> mittaukset() {
//        if (this.mittaukset.size() == 0) {
//            return this.mittaukset = new ArrayList<>();
//        } else {
        return this.mittaukset;
//        }
    }
    
    

    @Override
    public boolean onPaalla() {
        for (Sensori sensori : sensorit) {
            if (sensori.onPaalla() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void paalle() {
        for (Sensori sensori : sensorit) {
            sensori.paalle();
        }
    }

    @Override
    public void poisPaalta() {
        for (Sensori sensori : sensorit) {
            sensori.poisPaalta();
        }
    }

    @Override
    public int mittaa() {
        System.out.println(sensorit.size());
        if (sensorit.size() == 0) {
            return 0;
        }
        int summa = 0;
//        if (this.onPaalla() == false) {
//            throw new IllegalStateException("Mittari ei päällä");
//        }
        for (Sensori sensori : sensorit) {
            summa = summa + sensori.mittaa();
        }
        mittaukset.add(summa / sensorit.size());
        return (summa / sensorit.size());

    }    
}