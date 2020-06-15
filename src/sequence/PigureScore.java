package sequence;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5명의 심사위원의 점수중에서 0 ~ 100점 만점에서
 * 최고점과 최하점을 제외한 3명의 점수평균 구하기
 */
public class PigureScore {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[5];
	for(int i=0; i<5; i++) {
		System.out.println("점점수: ");
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

