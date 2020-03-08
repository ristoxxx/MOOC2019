
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {
    public int compare(Kortti k1, Kortti k2) {
        return ((k1.getMaa().ordinal() * 100) + k1.getArvo()) - ((k2.getMaa().ordinal() * 100) + k2.getArvo());
    }
    
}
