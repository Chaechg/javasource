package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) {
		
		Connection con = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.0.28:1521:xe";
			String user = "c##scott";
			String password = "tiger";
			
			con = DriverManager.getConnection(url, user, password);
			
			if (con != null) {
				System.out.println("연결되었습니다.");
				
				//sql 구문을 작성 => emp 테이블의 모든 데이터 조회
				String sql = "SELECT * FROM emp";
				
				//sql 구문을 데이터베시이스 서버로 전송
				pstmt = con.prepareStatement(sql);
				
				//sql 구문이 실행된 결과를 받아오기
				rs = pstmt.executeQuery();
				
				//받아온 결과를 화면에 출력
				System.out.println("empno	ename	job	mgr	hiredate	sal	comm	deptno");
				
				while (rs.next()) { //ResultSet 객체 안에 읽어오 내용이 있으면 true
					System.out.print(rs.getInt("empno")+"\t"); 	//number
					System.out.print(rs.getString("ename")+"\t");	//varchar2	
					System.out.print(rs.getString("job")+"\t");
					System.out.print(rs.getInt("mgr")+"\t");
					System.out.print(rs.getDate("hiredate")+"\t"); //Date
					System.out.print(rs.getInt("sal")+"\t");
					System.out.print(rs.getInt("comm")+"\t");
					System.out.println(rs.getInt("deptno"));
					
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		
		
		
		
	}
}
