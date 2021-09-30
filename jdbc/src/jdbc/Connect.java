package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static void main(String[] args) {
		Connection con =null;
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//연결 시도
			//192.168.0.28 : 본인 컴퓨터
			//1521 : 포트번호
			//xe: 오라클 익스프레스 버전
			String url = "jdbc:oracle:thin:@192.168.0.28:1521:xe";
			String user = "c##scott";
			String password ="tiger";
			con = DriverManager.getConnection(url, user, password);
			
			if (con != null) {
				System.out.println("연결되었습니다.");
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
