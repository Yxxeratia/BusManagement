package swing;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	private Connection conn;
    
    public Connection getConn() {
        return conn;
    }
    
    public DBConnection() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Test;" + "encrypt=true; trustServerCertificate=true; sslProtocol=TLSv1.2";
        String username = "sa";
        String password = "12345";
        
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
