package rps;

import java.util.Scanner;

public class whileDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴: 1.게임 0.종료");
			int flag = sc.nextInt();
			switch(flag) {
			case 0 : System.out.println("게임 종료;");return;
			case 1 : System.out.println("게임 중...");break;
			}
		}
	}

}
