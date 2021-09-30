package arrays;

import java.util.Arrays;

public class ArraysEx3 {
	public static void main(String[] args) {
		
		int arr3[] = {37,21,56,99,88,58,62,15,39,78};
		
		//58 숫자가 몇번째에 있는지 조회
		//순차검색
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == 15) {
				System.out.println(i+1+"번째 찾았음");
				break;
			}
		}
		
		System.out.println();
		
		//Arrays를 이용해 조회
		
		//binarySearch : 이진검색 (정렬을 먼저 한 후에 실행)
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		int pos = Arrays.binarySearch(arr3, 15); //=>정렬한 후의 순서대로 출력
		System.out.println(pos+1+"번째 찾았음"); //정렬을 하지 않으면 -3이 나옴
											
		
		
		
		
	}
}
