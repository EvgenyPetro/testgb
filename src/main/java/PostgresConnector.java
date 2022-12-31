import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnector {

    private final String URL = "jdbc:postgresql://localhost/testgb";
    private final String USER = "root";
    private final String PASSWORD = "root";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

}