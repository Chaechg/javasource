package arrays;

import java.util.Arrays;

/* Arrays : 배열을 다루는데 유용한 메서드 제공
 * 배열 복사, 배열 채우기, 배열의 정렬, 검색, 문자열 비교, 출력
 * 배열을 리스트로 변환
 */

public class ArraysEx1 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int [][] arr2 = {
				{11,12,13},
				{21,22,23}
		};
		
		System.out.println(arr);  	//주소값만 나온다.
		System.out.println(arr2);	//주소값만 나온다. 
				//int는 기본타입이라, toString을 오버라이딩 할 수도 없다.
		
		System.out.println(Arrays.toString(arr));  	
		System.out.println(Arrays.deepToString(arr2));
							//2차원 배열은 deepToString을 써야한다.
	}
}
