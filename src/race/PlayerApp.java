package race;

import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		Player[] players = new Player[2];
		
		for(int i=0;i<2;i++) {
			System.out.println("이름을 입력해주세요 :");
			player.setName(sc.next());
			
			System.out.println("기록을 입력해주세요 :");
			player.setRecord(sc.nextInt());
			
			System.out.println("이름 : "+player.getName());
			System.out.println("기록 : "+player.getRecord());
		
		}
	}
}
