package race;

import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		Player[] players = new Player[2];
		
		for(int i=0;i<2;i++) {
			System.out.println("�̸��� �Է����ּ��� :");
			player.setName(sc.next());
			
			System.out.println("����� �Է����ּ��� :");
			player.setRecord(sc.nextInt());
			
			System.out.println("�̸� : "+player.getName());
			System.out.println("��� : "+player.getRecord());
		
		}
	}
}
