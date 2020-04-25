package tietokantaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Paaohjelma {
    private static final String URL = "jdbc:sqlite:C:\\SQLite\\shoppingList.sqlite";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");

        Connection yhteys = DriverManager.getConnection(URL);				//prepare connection to database
        
        Scanner lukija = new Scanner(System.in);							//create scanner lukija
		
        DAOpattern dao = new DAOpattern(yhteys);							//create interface and commands to control DB
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(lukija,dao);		//Create user interface kayttoliittyma 
        
       
        System.out.println("Welcome to the shopping list app!");			//Print welcome text 
		kayttoliittyma.aloita();											//Start user interface
																	        //close all resources      
        yhteys.close();														//close connection
        lukija.close();														//close scanner
    }
}