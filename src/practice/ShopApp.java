package practice;

import java.util.Scanner;

public class ShopApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Shop shop = new Shop();
		Shop[] shops = new Shop[3];
		
		for(int i=0;i<3;i++) {
			System.out.println("�̸� : ");
			shop.setName(sc.next());
			
			System.out.println("�� ���� :");
			shop.setPhone(sc.nextInt());
			
			System.out.println("TV ���� :");
			shop.setTv(sc.nextInt());
			
			
			System.out.println("��ǻ�� ���� :");
			shop.setComputer(sc.nextInt());
			
			shop.sum();
		}
		
		
	}

}
