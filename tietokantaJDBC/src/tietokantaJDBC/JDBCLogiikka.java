package tietokantaJDBC;
import java.sql.*;

public class JDBCLogiikka {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        String url      = "jdbc:sqlite:C:\\\\SQLite\\\\ekadb.sqlite";   //database specific url.
        String user     = "";
        String password = "";

        try(Connection connection = DriverManager.getConnection(url)) {
            try(Statement statement = connection.createStatement()){
                String sql = "select * from people";
                try(ResultSet result = statement.executeQuery(sql)){
                    while(result.next()) {
                        String name = result.getString("name");
                        long   age  = result.getLong  ("age");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}



