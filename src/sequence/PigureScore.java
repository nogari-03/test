package sequence;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5���� �ɻ������� �����߿��� 0 ~ 100�� ��������
 * �ְ����� �������� ������ 3���� ������� ���ϱ�
 */
public class PigureScore {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[5];
	for(int i=0; i<5; i++) {
		System.out.println("������: ");
		arr[i] = sc.nextInt();
	}
	
	Arrays.sort(arr);
	int Min = arr[0];
	int Max = arr[arr.length-1];
	int sum = 0; 

	for(int i=0;i<arr.length;i++) {
		sum += arr[i];
	}
	int result = (sum - Max - Min)/3;
	System.out.println(result);
}
}

