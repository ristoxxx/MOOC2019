package tietokantaJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Kayttoliittyma {
	private Scanner input;
	private Connection yhteys;
	private String[] komennot = {"list","add","remove all","help","quit"};
	public Kayttoliittyma(Scanner lukija,Connection yhteys) {
        this.input = lukija;
        this.yhteys = yhteys;
    }
	
	public void aloita()throws SQLException {		
		tulostaKomennot();
		lue();
	}
	
	public void tulostaKomennot() {
		System.out.println("Available commands:");
		for (String komento : komennot) {
			System.out.println(komento);
		}
	}
	
	public void listaa() throws SQLException{
		System.out.println("Shopping list contents:");
		PreparedStatement kysely = yhteys.prepareStatement("SELECT * FROM ShoppingListItem");

        ResultSet tulokset = kysely.executeQuery();

        while (tulokset.next()) {
            long id = tulokset.getLong("id");
            String tuotenimi = tulokset.getString("title");

            System.out.println(id + " " + tuotenimi);
        }
        kysely.close();
        tulokset.close();
	}
	
	public void lisaa(String syote) throws SQLException {
		PreparedStatement insertKysely = yhteys.prepareStatement("INSERT INTO ShoppingListItem (title) VALUES (?)");
        insertKysely.setString(1, syote);

        int rivit = insertKysely.executeUpdate();
        System.out.println("Lisättiin " + rivit + " riviä");
		System.out.println("Successfully added "+ syote);
		insertKysely.close();
	}
	
	public void poista(String syote) throws SQLException{
		PreparedStatement insertKysely = yhteys.prepareStatement("DELETE FROM ShoppingListItem");//WHERE id=2
        //insertKysely.setString(1, syote);

        int rivit = insertKysely.executeUpdate();
        System.out.println("Successfully removed " + rivit + " riviä");
		insertKysely.close();
		//String tuloste = ("Successfully removed "+ syote);
		//System.out.println(tuloste);
	}
	
	public void lue()throws SQLException {
		System.out.print("> ");
		String command = input.next(); // ensimmäinen sana riviltä: "add"
		String parameter = input.nextLine(); // loppurivi: "Pepperoni pizza"
		switch (command) {
		case "quit":			// quit the program
		    break;
		case "add":
			lisaa(parameter);	// store the given product in DB
		    lue();
		    break;
		case "remove":
			poista(parameter);	// try removing the product from the DB
			lue();
		    break;
		case "list":
			listaa(); 			// list all lines in DB
			lue();
		    break;
		case "help":
			aloita();			// print the help text
		    break;
		default:
			aloita();
		    // print instructions on how to use this shopping list application
		    break;
		}
	}
}