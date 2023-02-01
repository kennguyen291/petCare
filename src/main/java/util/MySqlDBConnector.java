package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDBConnector{
	public static Connection makeConnection() {
		Connection conn = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pet-care?serverTimezone=Australia/Sydney", "petcare_admin", "123123");
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
