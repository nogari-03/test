package rps;

import java.util.Scanner;

public class RpsApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����,����,���� ������.");
		System.out.println("1.���� 2.���� 3.��");
		int player = scanner.nextInt();
		int computer = 0;
		String result = "";
		System.out.println("**************************");
		System.out.println("�÷��̾�" + player);
		System.out.println("��ǻ��" + computer);
		System.out.println("�÷��̾�" + result);

		if(player>computer) {
			result="�̰���ϴ�.";
		}else if(player==computer) {
			result="�����ϴ�."
		}
	}

}
