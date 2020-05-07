package tietokantaJDBC;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DAOpatternTest {

	private DAOpattern dao = new DAOpattern();

     /**
     * This method clears the test database and inserts two rows directly in the
     * database before each test with a delete statement.
     * 
     * This way every time the tests are executed they have exactly the same data to
     * work with.
     * 
     * !! Make sure to always use a different database environment variable for each
     * execution environment to prevent data loss or corruption !!
     */
    @BeforeEach
    public void setUp() throws Exception {
        Connection connection = dao.connect();
        connection.prepareStatement("delete from ShoppingListItem").executeUpdate();
        connection.prepareStatement("insert into ShoppingListItem (id, title) values (1, 'Milk'), (2, 'Eggs')").executeUpdate();
        connection.close();
    }
    @Test
    public void lisaa() {								//Tests adding item to list
    	String x = dao.lisaa("Honey");
    	assertEquals(x, "Successfully added Honey");
    }
    
    @Test												//Tests removing item from list
    public void poista() {
    	String x = dao.poista("Milk");
    	assertEquals(x, "Successfully removed Milk");
    }
    @Test												//Tests clearing list from all items
    public void tyhjenna() {
    	String x = dao.tyhjenna();
    	assertEquals(x, "Successfully removed 2 lines");
    }
    // Write the actual tests methods here. You can use Milk (1) and Eggs (2) in all of your tests!
}
