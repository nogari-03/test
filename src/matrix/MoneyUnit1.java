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
		return String.format("5만원 : %d개\n1만원 : %d개\n5천원 : %d개\n"
				+ "1천원 : %d개\n5백원 : %d개\n백원 : %d원\n오십원 : %d원\n십원 : %d원\n",
				counts[0], counts[1],counts[2],counts[3],counts[4],counts[5],counts[6],counts[7]);
	}
}

public class MoneyUnit1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("0. 종료 1. 입력");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1 :
				System.out.println("금액을 입력해주세요");
				int price = scanner.nextInt();
				System.out.printf("요청 금액 : %d원\n", price);
				Money0 m0 = new Money0();
				System.out.println(m0.calc(price));
			}
		}
	}

}