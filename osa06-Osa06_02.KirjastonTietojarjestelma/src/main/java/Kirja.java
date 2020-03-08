/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Kirja {
    private String nimike;
    private String julkaisija;
    private int julkaisuvuosi;
    
    public Kirja(String nimike, String julkaisija, int julkaisuvuosi) {
        this.nimike = nimike;
        this.julkaisija = julkaisija;
        this.julkaisuvuosi = julkaisuvuosi;
    }
    public String nimeke() {
        return this.nimike;        
    }
    
    public String julkaisija() {
        return this.julkaisija;    
    }    
    
    public int julkaisuvuosi() {
        return this.julkaisuvuosi;        
    }
    
    @Override
    public String toString(){
        return this.nimike + ", " + this.julkaisija + ", " + this.julkaisuvuosi;    
    }
}