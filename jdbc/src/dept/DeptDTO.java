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
//���̺� ���� �Ȱ��� �ۼ�
public class DeptDTO {
	
	private int deptno;
	private String dname;
	private String loc;
	
	// ������, getter/setter, toString
	// lombok�� �̿��� Ŭ���� �ۿ��� ����
}
