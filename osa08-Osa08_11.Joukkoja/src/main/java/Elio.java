/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Elio implements Siirrettava {
    
    private int x;
    private int y;
                
    public Elio(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void siirra(int dx, int dy) {
        this.x = this.x + dx;
        this.y =this.y + dy;
    }
    
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }
}