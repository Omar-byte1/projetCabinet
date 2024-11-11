package ma.Cabinet.repository;
import java.sql.Connection;
import java.sql.DriverManager;


public interface PatientRepository {
    private Connection getConnection() throws Exception {
        // Replace with your database connection details
        String url = "jdbc:mysql://localhost:3306/projectCabinet";
        String user = "username";
        String password = "password";
        return DriverManager.getConnection(url, user, password);
    }

}
