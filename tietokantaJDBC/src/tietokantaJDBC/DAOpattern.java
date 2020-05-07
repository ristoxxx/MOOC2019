package tietokantaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOpattern implements OstosRajapinta {
	private static final String URL = System.getenv("JDBC_DATABASE_URL");					//DB location 
	private Connection yhteys = null;													//DB connection
	private PreparedStatement kysely = null;											//DB query
	private ResultSet tulokset = null;													//DB query results
	private String error = "Something went wrong. No changes made.";						//Error message
	private List<Ostos> ostokset;														//DB query results list

	public DAOpattern() {																//Empty constructor
	}
	
	public Connection connect() throws SQLException{									//connection setup for testing
		yhteys = DriverManager.getConnection(URL);
		return yhteys;
	}
	
	public List<Ostos> listaa() {
		ostokset = new ArrayList<Ostos>();												//Creating list ostokset for DB query results
		nollaa();																		//Setting some values to null
		try {
			yhteys = DriverManager.getConnection(URL);									//Open connection to DB
			kysely = yhteys.prepareStatement("SELECT * FROM ShoppingListItem");			//Prepare query to DB
			tulokset = kysely.executeQuery();											//Execute query to DB and save results to ResultSet tulokset 
			while (tulokset.next()) {													//Go trough ResultSet tulokset line by line and
				long id = tulokset.getLong("id");										//get id and save it to id :)
				String tuotenimi = tulokset.getString("title");							//get title and save it to tuotenimi
				ostokset.add(new Ostos(tuotenimi,id));									//generate new object Ostos from id and tuotenimi and place it to list ostokset
			}
			return ostokset;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;																//return null if something went wrong
		} finally {
			close(yhteys, kysely, tulokset);
		}
	}
	//add entry to DB
	public String lisaa(String syote) {
		nollaa();
		try {
			yhteys = DriverManager.getConnection(URL);
			kysely = yhteys.prepareStatement("INSERT INTO ShoppingListItem (title) VALUES (?)");
			kysely.setString(1, syote);
			kysely.executeUpdate();
			kysely.close();
			String tuloste = ("Successfully added " + syote);
			return tuloste;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return error;
		} finally {
			close(yhteys, kysely, tulokset);
		}
	}
	//clear all entries fron DB
	public String tyhjenna() {
		nollaa();
		try {
			yhteys = DriverManager.getConnection(URL);
			System.out.println("Shopping list contents:");
			kysely = yhteys.prepareStatement("DELETE FROM ShoppingListItem");
			int lines = kysely.executeUpdate();
			String tuloste = ("Successfully removed " + lines + " lines");
			return tuloste;
		} catch (SQLException e) {
			e.printStackTrace();
			return error;
		} finally {
			close(yhteys, kysely, tulokset);
		}
	}
	//remove object from DB
	public String poista(String syote) {
		nollaa();
		try {
			yhteys = DriverManager.getConnection(URL);
			kysely = yhteys.prepareStatement("DELETE FROM ShoppingListItem WHERE title = ?");
			kysely.setString(1, syote);
			kysely.executeUpdate();
			kysely.close();
			String tuloste = ("Successfully removed " + syote);
			return tuloste;			
		} catch (SQLException e) {
			e.printStackTrace();
			return error;
		} finally {
			close(yhteys, kysely, tulokset);
		}
	}
	//reset some values to null
	private void nollaa() {
		yhteys = null;
		kysely = null;
		tulokset = null;
	}
	//close all open resources
	private void close(Connection connection, PreparedStatement statement, ResultSet results) {
        if (results != null) {
            try {
                results.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
}