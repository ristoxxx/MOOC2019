package tietokantaJDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        
        Scanner lukija = new Scanner(System.in);							//create scanner lukija
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(lukija);			//Create user interface kayttoliittyma 
             
        System.out.println("Welcome to the shopping list app!");			//Print welcome text 
		kayttoliittyma.aloita();											//Start user interface
        lukija.close();														//close scanner
    }
}