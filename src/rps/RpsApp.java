package rps;

import java.util.Random;
import java.util.Scanner;

public class RpsApp {
	
	public static void game(Scanner scanner, Random random) {
		
			System.out.println("가위,바위,보를 고르세요.");
			System.out.println("1.가위 2.바위 3.보");
			int player = scanner.nextInt();
			int computer = random.nextInt(3)+1;
			
			String rpsP = "";
			switch(player) {
			case 1 : rpsP = "가위"; break;
			case 2 : rpsP = "바위"; break;
			case 3 : rpsP = "보"; break;
			}
			
			String rpsC = "";
			switch(computer) {
			case 1 : rpsC = "가위"; break;
			case 2 : rpsC = "바위"; break;
			case 3 : rpsC = "보"; break;
			}
			
			String result = "";
			System.out.println("**************************");
			System.out.println("플레이어 " + rpsP);
			System.out.println("컴퓨터 " + rpsC);
			System.out.println("결과 " + result);

			if( player == computer ) {
			result="비겼습니다.";
			}else if((computer+1)%3 == player) {
			result = "승리";
			}else {
			result = "패배";	
			}
//			if(player == 1 && computer == 2) {result = "패배";
//			}else if(player == 1 && computer == 3) {result = "승리";
//			}else if(player == 2 && computer == 1) {result = "승리";
//			}else if(player == 2 && computer == 3) {result = "패배";
//			}else if(player == 3 && computer == 1) {result = "패배";
//			}else if(player == 3 && computer == 2) {result = "승리";
//			}else {result="무승부";}
			
			System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		boolean work=true;
		
		while(work) {
			System.out.println("메뉴: 0.종료 1.게임");
			int menu =scanner.nextInt();

			switch(menu) {
			case 0: 
				System.out.println("게임이 종료되었습니다.");
				work=false;
				break;
			case 1: 
				game(scanner,random);
			}
			
		}
	}
}
//if( player == computer ) {
//result="비겼습니다.";
//}else if((computer+1)%3 == player) {
//result = "플레이어 승리";
//}else {
//result = "컴퓨터 승리";	
//}

//private static String rps(int player) {
//String rpsP = "";
//
//switch(player) {
//case 1 : rpsP = "가위"; break;
//case 2 : rpsP = "바위"; break;
//case 3 : rpsP = "보"; break;
//
//return rpsP;
//}