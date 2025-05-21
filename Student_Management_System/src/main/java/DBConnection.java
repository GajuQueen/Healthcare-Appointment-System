import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    public static final String URL = "jdbc:postgresql://localhost:5432/JDBC+CRUD+Coding+Task";
    public static final String USERNAME = "Postgres";
    public static final String PASSWORD = "Habimana";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
