package race;

import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		Player[] players = new Player[3];
		
		for(int i=0;i<players.length;i++) {
			Player player = new Player();

			System.out.println("�̸��� �Է����ּ��� :");
			player.setName(sc.next());
			
			System.out.println("����� �Է����ּ��� :");
			player.setRecord(sc.nextInt());
			players[i] = player;
//			System.out.println("�̸� : "+player.getName());
//			System.out.println("��� : "+player.getRecord());
		}
		
//		for(int i=0;i<players.length;i++) {
//			players[i].showRecord();
//		}
		
		Player[] ranking = new Player[3];
		if(players[0].getRecord() < players[1].getRecord()) {
			if(players[0].getRecord() < players[2].getRecord()) {
				ranking[0] = players[0];
				System.out.println(players[0].getName()+"�� 1��");
				}else {
					ranking[0] = players[1];
					System.out.println(players[1].getName()+"�� 1��");
				}
				}else {
					ranking[0] = players[2];
					System.out.println(players[2].getName()+"�� 1��");
			}
		}	
	}
