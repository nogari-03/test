package matrix;

import java.util.Random;
import java.util.Scanner;

public class LottoApp3 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		
		Scanner sc = new Scanner(System.in);
		Lotto instance = new Lotto();
		System.out.println("얼마치를 구입합니까?");
		int many = sc.nextInt()/1000;
		for(int i=0; i<many; i++) {
			instance.generate(random, lotto, instance);
			System.out.println("");
		}
		
		
	}

}
