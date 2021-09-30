package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//테이블 모양과 똑같이 작성
public class DeptDTO {
	
	private int deptno;
	private String dname;
	private String loc;
	
	// 생성자, getter/setter, toString
	// lombok을 이용해 클래스 밖에서 진행
}
