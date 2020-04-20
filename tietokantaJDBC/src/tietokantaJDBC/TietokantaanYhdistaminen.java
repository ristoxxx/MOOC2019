package tietokantaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TietokantaanYhdistaminen {
    private static final String URL = "jdbc:sqlite:C:\\SQLite\\shoppingList.sqlite";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");

        Connection yhteys = DriverManager.getConnection(URL);				//prepare connection to database
        
        Scanner lukija = new Scanner(System.in);							//create scanner lukija
		
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(lukija,yhteys);	//Create user interface kayttoliittyma 

        System.out.println("Welcome to the shopping list app!");			//Print welcome text 
		kayttoliittyma.aloita();											//Start user interface
        // suljetaan kaikki resurssit       
        yhteys.close();														//close connection
        lukija.close();														//close scanner
        kayttoliittyma.close();												//close user interface
    }
}