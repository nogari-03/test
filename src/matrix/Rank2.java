package matrix;

import java.util.Random;

public class Rank2 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[5];
		for(int i =0; i< arr.length; i++) {
			arr[i] = random.nextInt(101);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d�� %d��\n",(i+1),arr[i]);
		}
	}

}
