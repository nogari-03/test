package race;

import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		Player[] players = new Player[3];
		
		for(int i=0;i<players.length;i++) {
			Player player = new Player();

			System.out.println("이름을 입력해주세요 :");
			player.setName(sc.next());
			
			System.out.println("기록을 입력해주세요 :");
			player.setRecord(sc.nextInt());
			players[i] = player;
//			System.out.println("이름 : "+player.getName());
//			System.out.println("기록 : "+player.getRecord());
		}
		
//		for(int i=0;i<players.length;i++) {
//			players[i].showRecord();
//		}
		
		Player[] ranking = new Player[3];
		if(players[0].getRecord() < players[1].getRecord()) {
			if(players[0].getRecord() < players[2].getRecord()) {
				ranking[0] = players[0];
				System.out.println(players[0].getName()+"이 1등");
				}else {
					ranking[0] = players[1];
					System.out.println(players[1].getName()+"이 1등");
				}
				}else {
					ranking[0] = players[2];
					System.out.println(players[2].getName()+"이 1등");
			}
		}	
	}
