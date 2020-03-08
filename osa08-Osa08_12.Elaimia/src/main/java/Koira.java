/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Koira extends Elain implements Aanteleva {
    
    public Koira() {
        super("Koira");
    }
    
    public Koira(String nimi) {
        super(nimi);
    }
    
    public void aantele() {
        hauku();
    }
    
    public void hauku() {
        System.out.println(super.getNimi() + " haukkuu");
    }
    
}
