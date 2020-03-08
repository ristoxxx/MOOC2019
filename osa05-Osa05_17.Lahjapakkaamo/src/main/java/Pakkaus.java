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

public class Pakkaus {

    private ArrayList<Lahja> lahjat;

    public Pakkaus() {
        this.lahjat = new ArrayList<>();
    }

    public void lisaaLahja(Lahja lahja) {
        this.lahjat.add(lahja);
    }

    public int yhteispaino() {
        int summa = 0;
        int indeksi = 0;

        while (indeksi < this.lahjat.size()) {
            summa += this.lahjat.get(indeksi).getPaino();
            indeksi++;
        }
        return summa;
    }
}