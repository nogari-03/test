package matrix;

import java.util.Scanner;

/**
 * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램
 * [요구사항] 금융업을 하는 고객사로부터 프로그램 개발요청이 들어왔습니다. 
 * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램 입니다.
 * 예를들어, 125,520 원을 입력하면 화면에 이렇게 보이게 하면 됩니다.
 * 표시하고 10원 미만은 절삭
 * *************************************************
 * 요청금액 : 126520 원
 * 5만원 : 2매
 * 1만원 : 2매
 * 5천원 : 1매
 * 1천원 : 1매
 * 5백원 : 1개
 * 백원 : 0개
 * 오십원 : 0개
 * 십원 : 2개 
 */
class Money {
	int five_manwon;
	int one_manwon;
	int five_cheonwon;
	int one_cheonwon;
	int five_h_won;
	int one_h_won;
	int fifty_won;
	int ten_won;
}
public class MoneyUnit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Money money = new Money();
		System.out.println("금액을 입력해주세요.");
		int input = sc.nextInt();
		System.out.println("입력받은 금액 : "+ input+" 원");
		
//		int five_manwon=input/50000;
//		System.out.println("5만원 : " +five_manwon+" 매");
//		
//		int one_manwon= (input-(50000*five_manwon))/10000;
//		System.out.println("1만원 : "+one_manwon+" 매");
//		
//		int five_cheonwon= (input-(50000*five_manwon)-(10000*one_manwon))/5000;
//		System.out.println("5천원 : "+five_cheonwon+" 매");
//		
//		int one_cheonwon= (input-(50000*five_manwon)-(10000*one_manwon)-(5000*five_cheonwon))/1000;
//		System.out.println("1천원 : "+one_cheonwon+" 매");
		boolean check = true;
		while(check) {
		if(input>50000) {
			money.five_manwon=input/50000;
			input = input-(money.five_manwon*50000);continue;
		}else if(input<50000 && input>10000) {
			money.one_manwon=input/10000;
			input = input-(money.one_manwon*10000);continue;
		}else if(input>5000) {
			money.five_cheonwon=input/5000;
			input = input -(money.five_cheonwon*5000);continue;
		}else if(input>1000) {
			money.one_cheonwon=input/1000;
			input = input -(money.one_cheonwon*1000);continue;
		}else if(input>500) {
			money.five_h_won=input/500;
			input = input -(money.five_h_won*500);continue;
		}else if(input>100) {
			money.one_h_won=input/100;
			input = input - (money.one_h_won*100);continue;
		}else if(input>50) {
			money.fifty_won=input/50;
			input = input - (money.fifty_won*50);continue;
		}else if(input>10) {
			money.ten_won=input/10;check=false;
		}
	}
			System.out.println("5만원 : "+money.five_manwon+" 매");
			System.out.println("1만원 : "+money.one_manwon+" 매");
			System.out.println("5천원 : "+money.five_cheonwon+" 매");
			System.out.println("1천원 : "+money.one_cheonwon+" 매");
			System.out.println("5백원 : "+money.five_h_won+" 매");
			System.out.println("1백원 : "+money.one_h_won+" 매");
			System.out.println("5십원 : "+money.fifty_won+" 매");
			System.out.println("1십원 : "+money.ten_won+" 매");
			
	}
}
