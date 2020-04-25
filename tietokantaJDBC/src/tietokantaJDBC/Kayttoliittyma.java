package tietokantaJDBC;
import java.sql.SQLException;
import java.util.Scanner;

public class Kayttoliittyma {
	private Scanner input;
	private String[] komennot = {"list","add (item)","remove (item)","help","clear list","quit"};
	private DAOpattern dao;
	
	public Kayttoliittyma(Scanner lukija,DAOpattern dao) {
        this.input = lukija;
        this.dao = dao;
    }
	
	public void aloita()throws SQLException {		
		tulostaKomennot();
		lue();
	}
	
	public void tulostaKomennot()throws SQLException {
		System.out.println("Available commands:");
		for (String komento : komennot) {
			System.out.println(komento);
		}
	}
	
	
	
	
	public void lue()throws SQLException {
		System.out.print("> ");
		String command = input.next(); 				// read first word from line
		String parameter = input.nextLine().trim(); // read end of line and trim line
		switch (command) {
		case "quit":								// quit the program
		    break;
		case "add":
			dao.lisaa(parameter);						// store the given product in DB
		    lue();
		    break;
		case "remove":
			dao.poista(parameter);						// try removing the product from the DB
			lue();
		    break;
		case "list":
			dao.listaa(); 								// list all lines in DB
			lue();
		    break;
		case "help":
			aloita();								// print the help text
		    break;
		case "clear":	
			dao.tyhjenna();								// clear all lines in DB
			aloita();
			break;
		default:
			aloita();							 	// print instructions on how to use this shopping list application
		    break;
		}
	}
}