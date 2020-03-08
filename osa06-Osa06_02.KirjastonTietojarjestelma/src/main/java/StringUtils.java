/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class StringUtils {
    
    public static boolean sisaltaa(String sana, String haettava) {
        sana = sana.trim();
        sana = sana.toUpperCase();
        haettava = haettava.trim();
        haettava = haettava.toUpperCase();
        if (sana.equals("NULL")) {
            return false;
        } else if (haettava.equals("NULL")) {
            return false;
        } else if (sana.contains(haettava)) {
            return true;
        } else {
            return false;
        }
    
    }
}