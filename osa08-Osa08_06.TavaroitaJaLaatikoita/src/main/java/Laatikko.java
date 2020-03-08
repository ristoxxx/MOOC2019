/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
import java.util.ArrayList;

public class Laatikko implements Talletettava {
    
    private ArrayList<Talletettava> laatikko;
    private double maksimiPaino;
    private double paino;
    
    public Laatikko(double maksimiPaino) {
        this.laatikko = new ArrayList<>();
        this.maksimiPaino = maksimiPaino;
        this.paino = 0;
    }
    
    public void lisaa(Talletettava talletettava) {
        if (paino() + talletettava.paino() < maksimiPaino) {
            laatikko.add(talletettava);
        }
    }
    
    public double paino() {
        double paino = 0;
        for (Talletettava talletettava : laatikko) {
            paino = paino + talletettava.paino();
        }
        // laske laatikkoon talletettujen tavaroiden yhteispaino
        return paino;
    }
    
    @Override
    public String toString() {
        return "Laatikko: " + laatikko.size() + " esinettä, paino yhteensä " + paino() + " kiloa";
    }
}
