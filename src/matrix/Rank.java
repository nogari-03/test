package matrix;

import java.util.Scanner;

/*
 * 5�� ������ �Է¹޾Ƽ� 1�� 90��, 2�� 86��, 3�� 77��, 4�� 66��, 5�� 40��
 * ���� ����Ͻÿ�. ��½� ����� �ݵ�� ����Ͻÿ�.
 */
public class Rank {
	public static void bubbleSort(int[] arr) {
//		Scanner sc = new Scanner(System.in);
//		int[] arr = {90, 86, 77, 66, 40};;
//		String[] rank = {"1��","2��","3��","4��","5��"};

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
		System.out.println("�ο� �� :");
		int[] arr = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("������ �Է����ּ���");
			arr[i]=sc.nextInt();
		}
		
		Rank.bubbleSort(arr);
		for(int i : arr) {
			System.out.println(i+" ");
		}
	}
}

