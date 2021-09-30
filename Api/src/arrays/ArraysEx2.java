package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {
	public static void main(String[] args) {
		//배열끼리 비교
		int arr1[] = {10,73,2,-5,42};
		int arr2[] = {10,73,2,-5,41};
		
		System.out.println(Arrays.equals(arr1, arr2)?"같음":"다름");
		
		System.out.println();
		
		int arr3[] = {37,21,56,99,88,58,62,15,39,78};
		
		//오름차순
		Arrays.sort(arr3); //sort는 반환타입이 없는 void이다.
		System.out.println(Arrays.toString(arr3));
		//System.out.println(arr3); => 주소값만 나온다.
		
		//내림차순
		Integer arr4[] = {37,21,56,99,88,58,62,15,39,78}; //객체타입으로 전환
		//sort 중 sort(T[],comparator<>)를 선택
		Arrays.sort(arr4, Comparator.reverseOrder()); //Comparator.naturalOrder()-오름차순
		System.out.println(Arrays.toString(arr4));
		
		String strArr[] = {"good","height","very","apple","zero","zoo"};
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr, Comparator.reverseOrder()); //String은 이미 객체 생성된 것.
		System.out.println(Arrays.toString(strArr));
		
		Character chArr[] = {'ㅎ','ㅅ','ㄱ','ㄷ','ㅁ','ㅂ','ㅊ'};
		Arrays.sort(chArr);
		System.out.println(Arrays.toString(chArr));
		
		
	
	}
}
