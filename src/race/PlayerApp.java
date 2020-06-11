package race;

import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Player[] players = new Player[3];
		
		for(int i=0;i<players.length;i++) {
			
			
			System.out.println("이름을 입력 : ");
			players[i].setName(sc.next());
			System.out.println("점수를 입력 : ");
			players[i].setRecord(sc.nextInt());;
			
			System.out.println(players[i].getName());
			System.out.println(players[i].getRecord());
		}
		
	}
		
//		String winName ="";
//		if(players[0].getRecord() < players[1].getRecord()
//				&& players[0].getRecord() < players[2].getRecord()) {
//			winName = players[0].getName();
//		} else if(players[1].getRecord() < players[0].getRecord()
//				&& players[1].getRecord() < players[2].getRecord()) {
//			winName = players[1].getName();
//		} else {
//			winName = players[2].getName();
//		}
//		
//		System.out.println(winName+"이 1등입니다.");
//	}
}
