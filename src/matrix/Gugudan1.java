package matrix;

import java.util.Scanner;

public class Gugudan1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇단인가요? :");
		int dan = scanner.nextInt();
		
		for(int i=1;i<10;i++) {
			int result = dan * i;
			System.out.println(dan +" x "+ i +" = "+ result);
		}
		
	}

}
