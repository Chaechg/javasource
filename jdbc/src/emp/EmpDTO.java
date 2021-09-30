package emp;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 테이블 결과와 똑같은 모양으로 작성
// ~~DTO : Data Transfer Object의 약자이다.
// ~~VO : Value Object
// 데이터의 전송이 목적이다.
// number => int, varchar => String, date = util.Date

//프로젝트 build path에 lombok을 추가해 준다.
@Setter  //setter 메소드 자동으로 생성
@Getter  //getter 메소드 자동으로 생성
@NoArgsConstructor //default 생성자 자동 생성
@AllArgsConstructor //인자를 모두 받는 생성자 자동 생성
@ToString
public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	//limbok을 실행하기 위해 기존에 있던 생성자와 getter,setter를 주석처리함
	
	//생성자는 기본적으로 default와 전부
//	public EmpDTO() {
//		super();
//	}
//	public EmpDTO(int empno, String ename, String job, int mgr, Date hiredate, int sal, int comm, int deptno) {
//		super();
//		this.empno = empno;
//		this.ename = ename;
//		this.job = job;
//		this.mgr = mgr;
//		this.hiredate = hiredate;
//		this.sal = sal;
//		this.comm = comm;
//		this.deptno = deptno;
//	}
//	public int getEmpno() {
//		return empno;
//	}
//	public void setEmpno(int empno) {
//		this.empno = empno;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public String getJob() {
//		return job;
//	}
//	public void setJob(String job) {
//		this.job = job;
//	}
//	public int getMgr() {
//		return mgr;
//	}
//	public void setMgr(int mgr) {
//		this.mgr = mgr;
//	}
//	public Date getHiredate() {
//		return hiredate;
//	}
//	public void setHiredate(Date hiredate) {
//		this.hiredate = hiredate;
//	}
//	public int getSal() {
//		return sal;
//	}
//	public void setSal(int sal) {
//		this.sal = sal;
//	}
//	public int getComm() {
//		return comm;
//	}
//	public void setComm(int comm) {
//		this.comm = comm;
//	}
//	public int getDeptno() {
//		return deptno;
//	}
//	public void setDeptno(int deptno) {
//		this.deptno = deptno;
//	}
	
	
	
	
	
	
	
}
