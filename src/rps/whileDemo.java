package rps;

import java.util.Scanner;

public class whileDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�޴�: 1.���� 0.����");
			int flag = sc.nextInt();
			switch(flag) {
			case 0 : System.out.println("���� ����;");return;
			case 1 : System.out.println("���� ��...");break;
			}
		}
	}

}
