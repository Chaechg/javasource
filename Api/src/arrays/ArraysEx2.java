package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {
	public static void main(String[] args) {
		//�迭���� ��
		int arr1[] = {10,73,2,-5,42};
		int arr2[] = {10,73,2,-5,41};
		
		System.out.println(Arrays.equals(arr1, arr2)?"����":"�ٸ�");
		
		System.out.println();
		
		int arr3[] = {37,21,56,99,88,58,62,15,39,78};
		
		//��������
		Arrays.sort(arr3); //sort�� ��ȯŸ���� ���� void�̴�.
		System.out.println(Arrays.toString(arr3));
		//System.out.println(arr3); => �ּҰ��� ���´�.
		
		//��������
		Integer arr4[] = {37,21,56,99,88,58,62,15,39,78}; //��üŸ������ ��ȯ
		//sort �� sort(T[],comparator<>)�� ����
		Arrays.sort(arr4, Comparator.reverseOrder()); //Comparator.naturalOrder()-��������
		System.out.println(Arrays.toString(arr4));
		
		String strArr[] = {"good","height","very","apple","zero","zoo"};
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr, Comparator.reverseOrder()); //String�� �̹� ��ü ������ ��.
		System.out.println(Arrays.toString(strArr));
		
		Character chArr[] = {'��','��','��','��','��','��','��'};
		Arrays.sort(chArr);
		System.out.println(Arrays.toString(chArr));
		
		
	
	}
}
