package rps;

import java.util.Random;
import java.util.Scanner;

public class RpsApp {
	
	public static void game(Scanner scanner, Random random) {
		
			System.out.println("����,����,���� ������.");
			System.out.println("1.���� 2.���� 3.��");
			int player = scanner.nextInt();
			int computer = random.nextInt(3)+1;
			
			String rpsP = "";
			switch(player) {
			case 1 : rpsP = "����"; break;
			case 2 : rpsP = "����"; break;
			case 3 : rpsP = "��"; break;
			}
			
			String rpsC = "";
			switch(computer) {
			case 1 : rpsC = "����"; break;
			case 2 : rpsC = "����"; break;
			case 3 : rpsC = "��"; break;
			}
			
			String result = "";
			System.out.println("**************************");
			System.out.println("�÷��̾� " + rpsP);
			System.out.println("��ǻ�� " + rpsC);
			System.out.println("��� " + result);

			if( player == computer ) {
			result="�����ϴ�.";
			}else if((computer+1)%3 == player) {
			result = "�¸�";
			}else {
			result = "�й�";	
			}
//			if(player == 1 && computer == 2) {result = "�й�";
//			}else if(player == 1 && computer == 3) {result = "�¸�";
//			}else if(player == 2 && computer == 1) {result = "�¸�";
//			}else if(player == 2 && computer == 3) {result = "�й�";
//			}else if(player == 3 && computer == 1) {result = "�й�";
//			}else if(player == 3 && computer == 2) {result = "�¸�";
//			}else {result="���º�";}
			
			System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		boolean work=true;
		
		while(work) {
			System.out.println("�޴�: 0.���� 1.����");
			int menu =scanner.nextInt();

			switch(menu) {
			case 0: 
				System.out.println("������ ����Ǿ����ϴ�.");
				work=false;
				break;
			case 1: 
				game(scanner,random);
			}
			
		}
	}
}
//if( player == computer ) {
//result="�����ϴ�.";
//}else if((computer+1)%3 == player) {
//result = "�÷��̾� �¸�";
//}else {
//result = "��ǻ�� �¸�";	
//}

//private static String rps(int player) {
//String rpsP = "";
//
//switch(player) {
//case 1 : rpsP = "����"; break;
//case 2 : rpsP = "����"; break;
//case 3 : rpsP = "��"; break;
//
//return rpsP;
//}