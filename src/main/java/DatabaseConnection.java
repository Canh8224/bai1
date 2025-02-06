import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/qlsv";
    private static final String USER = "root1";
    private static final String PASSWORD = "123456789";

    public static Connection connect() {
        try {

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(" Kết nối thành công!");
            return conn;
        } catch (SQLException e) {
            System.out.println(" Kết nối thất bại: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        connect();
    }
}
