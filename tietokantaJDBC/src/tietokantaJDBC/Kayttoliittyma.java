package tietokantaJDBC;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Kayttoliittyma {
	private Scanner input;
	private String[] komennot = {"list","add (item)","remove (item)","help","clear list","quit"};
	private DAOpattern dao;
	private List<Ostos> ostokset;
	
	public Kayttoliittyma(Scanner lukija) {
        this.input = lukija;
        this.dao = new DAOpattern();
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

	public void lue() throws SQLException {
		String tuloste;
		System.out.print("> ");
		String command = input.next(); 				// read first word from line
		String parameter = input.nextLine().trim(); // read end of line and trim line
		switch (command) {
		case "quit":								// quit the program
		    break;
		case "add":
			tuloste = dao.lisaa(parameter);			// store the given product in DB
			System.out.println(tuloste);
		    lue();
		    break;
		case "remove":
			tuloste = dao.poista(parameter);		// try removing the product from the DB
			System.out.println(tuloste);
			lue();
		    break;
		case "list":
			ostokset = dao.listaa();				// list all lines in DB
			System.out.println("Shopping list contents:");
			for (Ostos ostos : ostokset) {
				long id = ostos.getRivi();
				String tuotenimi = ostos.getNimi();
				System.out.println(id + " " + tuotenimi);
			} 
			lue();
		    break;
		case "help":
			aloita();								// print the help text
		    break;
		case "clear":	
			tuloste = dao.tyhjenna();				// clear all lines in DB
			System.out.println(tuloste);
			aloita();
			break;
		default:
			aloita();							 	// print instructions on how to use this shopping list application
		    break;
		}
	}
}