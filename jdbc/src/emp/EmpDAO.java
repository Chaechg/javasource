package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// JDBC - 자바와 DB의 연결
// ~DAO : database와 관련된 작업 클래스
// 커넥션, 조회(select), 삽입, 삭제, 수정

public class EmpDAO {
	
	//드라이버 로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//커넥션
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##scott";
		String password = "tiger";
		Connection con = null;
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	// 전체 조회
	public List<EmpDTO> select () {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		List<EmpDTO>list = new ArrayList<EmpDTO>();
		
		try {
			con = getConnection();
			String sql = "select * from emp_temp order by hiredate desc";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
				list.add(dto);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close(); //닫았으므로 rs로 return할 수 없다. 어떻게 main으로 넘길 것인가?
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
		
	}
	//특정 사원을 조회
	public EmpDTO getRow (int empno) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		EmpDTO dto = null;
		
		try {
			con = getConnection();
			
			//String sql = "select * from emp where empno="+empno;
			
			String sql = "select * from emp_temp where empno = ?";
			psmt = con.prepareStatement(sql);
			
			//물음표에 대한 처리
			psmt.setInt(1, empno);			
			
			rs = psmt.executeQuery();
			if (rs.next()) { //하나의 행에서 필드별로 가져오기 + EmpDTO 담기
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close(); //닫았으므로 rs로 return할 수 없다. 어떻게 main으로 넘길 것인가?
				psmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	
	//급여 오름차순 조회
	public List<EmpDTO> orderBySal() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//여러 줄의 결과가 나올 것이므로 배열을 생성
		//결과가 한 줄이라면 EmpDTO = null;로 대신한다.
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		
		try {
			//커넥션 연결
			con = getConnection();
			//커넥션을 통해 SQL문 보내기
			String sql = "select ename, sal from emp_temp order by sal";
			pstmt = con.prepareStatement(sql);
			//SQL 실행
			rs = pstmt.executeQuery();
			//받은 결과를 리턴 - 결과가 여러개이므로 while문 사용/결과가 하나면 if문 사용
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				//rs에서 가져올 때는 필드명을 사용하는 방법이나, 순서를 이용하는 방법이 있다.
				//"select ename, sal from emp order by sal";에서
				//ename이 1, sal이 2이다 
				dto.setEname(rs.getString(1));
				dto.setSal(rs.getInt(2));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	//특정 사원의 급여 수정
	public boolean updateSal(int empno, int sal) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;
		
		try {
			con = getConnection();
			
			String sql = "update emp_temp set sal =? where empno =?";
			//?는 updateSal(int empno, int sal)에 들어갈 값이다.
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sal);
			pstmt.setInt(2, empno);
			//setInt안의 숫자는 해당 숫자번째의 ?를 의미한다. 물음표가 한개라도 무조건 넣어야 한다.
			
			int result = pstmt.executeUpdate();
			if (result>0) { //update 성공의 의미
				updateFlag = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return updateFlag; //true 업데이트 성공, false 업데이트 실패
	}
	
	//특정 사원의 추가수당 수정
	public boolean updateComm(int comm, int sal) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;
		
		try {
			con = getConnection();
			String sql = "update emp_temp set comm =? where sal <=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, comm);
			pstmt.setInt(2, sal);
			int result = pstmt.executeUpdate();
			if (result>0) {
				updateFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return updateFlag;
	}
	
	//신입 사원 입력
	public boolean insetEmp(EmpDTO dto) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean insertFlag = false;
		try {
			con = getConnection();
			String sql = "insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno)";
			sql+="values(?,?,?,?,sysdate,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setString(3, dto.getJob());
			pstmt.setInt(4, dto.getMgr());
			pstmt.setInt(5, dto.getSal());
			pstmt.setInt(6, dto.getComm());
			pstmt.setInt(7, dto.getDeptno());
			
			int result = pstmt.executeUpdate();
			if (result >0) {
				insertFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return insertFlag;
	}
	
	//특정 사원 삭제
	public boolean deleteEmp(int empno) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean deleteFlag = false;
		
		try {
			con = getConnection();
			String sql = "delete emp_temp where empno =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			int result = pstmt.executeUpdate();
			if (result>0) {
				deleteFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return deleteFlag;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
