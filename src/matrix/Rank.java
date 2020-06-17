package matrix;

import java.util.Scanner;

/*
 * 5의 점수를 입력받아서 1등 90점, 2등 86점, 3등 77점, 4등 66점, 5등 40점
 * 으로 출력하시오. 출력시 행렬을 반드시 사용하시오.
 */
public class Rank {
	public static void bubbleSort(int[] arr) {
//		Scanner sc = new Scanner(System.in);
//		int[] arr = {90, 86, 77, 66, 40};;
//		String[] rank = {"1등","2등","3등","4등","5등"};

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j] =temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인원 수 :");
		int[] arr = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("점수를 입력해주세요");
			arr[i]=sc.nextInt();
		}
		
		Rank.bubbleSort(arr);
		for(int i : arr) {
			System.out.println(i+" ");
		}
	}
}

