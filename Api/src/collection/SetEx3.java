package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// hashCode() / equals() => 둘 다 같다면 저장하지 않음.
		set.add(new Member("hong123", "hong123", "홍길동"));
		set.add(new Member("hong124", "hong123", "홍길동"));
		set.add(new Member("hong125", "hong123", "홍길동"));
		set.add(new Member("hong123", "hong123", "홍길동"));
		
//		for (Member member : set) {
//			System.out.println(member); //중복저장이 됨
//		}
		for (Member member : set) {
			System.out.println(member+" "+member.hashCode()); //hashCode값이 다 다르다.
		}
		//1)id의 해시코드가 같아도 중복저장 된다.
		//2)id의 equals()도 같아야 중복저장이 안된다.
		//Member클래스에 hashCode와 equals를 오버라이딩 함으로써 중복되는 것을 제외할 수 있다.
		
		
		
	}
}
