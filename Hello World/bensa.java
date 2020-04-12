package bensa;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Bensa {

    public static void main(String[] args) {
    	double bensa, verollinenBensanHinta;
    	DecimalFormat d = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        System.out.print("Anna Bensan hinta: ");
        
        bensa = input.nextDouble();
        
        System.out.println("Bensan verollinen hinta on " + bensa);
        // toteuta ohjelma tänne

    }
}
