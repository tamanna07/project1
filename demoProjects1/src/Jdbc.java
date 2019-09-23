import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc {

        public static void main(String[] args) throws SQLException {
            String url = "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
            String user = "root";
            String password = "0172koly";

            Connection connection = null;
            Statement statement = null;

            try {
                // 1. Create a connection
                connection = DriverManager.getConnection(url, user, password);

                // 2. Create a statement
                statement = connection.createStatement();

                // 3. Execute the SQL Query
                String query = "insert into movie (id, title, release_year, genre, mpaa_rating)" +
                        " values (4, 'Bader Meye Josna', 1980, 'Drama', 'PG')";
                statement.execute(query);

                // 4. Process result set (if necessary)

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                statement.close();
                connection.close();
            }
        }
    }























