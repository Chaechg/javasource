package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static void main(String[] args) {
		Connection con =null;
		try {
			//����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			//���� �õ�
			//192.168.0.28 : ���� ��ǻ��
			//1521 : ��Ʈ��ȣ
			//xe: ����Ŭ �ͽ������� ����
			String url = "jdbc:oracle:thin:@192.168.0.28:1521:xe";
			String user = "c##scott";
			String password ="tiger";
			con = DriverManager.getConnection(url, user, password);
			
			if (con != null) {
				System.out.println("����Ǿ����ϴ�.");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
