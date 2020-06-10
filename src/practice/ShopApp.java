package practice;

import java.util.Scanner;

public class ShopApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Shop shop = new Shop();
		Shop[] shops = new Shop[3];
		
		for(int i=0;i<3;i++) {
			System.out.println("이름 : ");
			shop.setName(sc.next());
			
			System.out.println("폰 가격 :");
			shop.setPhone(sc.nextInt());
			
			System.out.println("TV 가격 :");
			shop.setTv(sc.nextInt());
			
			
			System.out.println("컴퓨터 가격 :");
			shop.setComputer(sc.nextInt());
			
			shop.sum();
		}
		
		
	}

}
