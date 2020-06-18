package matrix;

import java.util.Scanner;

class Money0{
	
	public String calc(int price) {
		int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] counts = new int[8];
		for(int i=0;i < units.length; i++) {
			counts[i] = price/units[i];
			price = price%units[i];
		}
		return String.format("5���� : %d��\n1���� : %d��\n5õ�� : %d��\n"
				+ "1õ�� : %d��\n5��� : %d��\n��� : %d��\n���ʿ� : %d��\n�ʿ� : %d��\n",
				counts[0], counts[1],counts[2],counts[3],counts[4],counts[5],counts[6],counts[7]);
	}
}

public class MoneyUnit1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("0. ���� 1. �Է�");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("����"); return;
			case 1 :
				System.out.println("�ݾ��� �Է����ּ���");
				int price = scanner.nextInt();
				System.out.printf("��û �ݾ� : %d��\n", price);
				Money0 m0 = new Money0();
				System.out.println(m0.calc(price));
			}
		}
	}

}