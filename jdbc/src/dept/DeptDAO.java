package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeptDAO {
	//empDAO static, Connection
	static {
		try {
			Class.forName("oracle.jdbc,OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1524:xe";
		String user = "c##scott";
		String password = "tiger";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}
		
		










}
