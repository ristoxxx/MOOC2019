package tietokantaJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOpattern {
	private Connection yhteys;
	
	public DAOpattern(Connection yhteys) {
        this.yhteys = yhteys;
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
        insertKysely.executeUpdate();
        insertKysely.close();
        String tuloste = ("Successfully added "+ syote);
		System.out.println(tuloste);
	}
	
	public void tyhjenna() throws SQLException{
		PreparedStatement insertKysely = yhteys.prepareStatement("DELETE FROM ShoppingListItem");//
		int lines = insertKysely.executeUpdate();
		insertKysely.close();
		String tuloste = ("Successfully removed " + lines + " lines");
		System.out.println(tuloste);
	}
	
	public void poista(String syote) throws SQLException{
		PreparedStatement insertKysely = yhteys.prepareStatement("DELETE FROM ShoppingListItem WHERE title = ?");//
        insertKysely.setString(1, syote);
        insertKysely.executeUpdate();
		insertKysely.close();
		String tuloste = ("Successfully removed "+ syote);
		System.out.println(tuloste);
	}

}
