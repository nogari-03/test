package matrix;

import java.util.Scanner;

/**
 * �ݾ��� �Է¹��� �� �츮���� ȭ���������� �ش� ������ ǥ���ϴ� ���α׷�
 * [�䱸����] �������� �ϴ� ����κ��� ���α׷� ���߿�û�� ���Խ��ϴ�. 
 * �ݾ��� �Է¹��� �� �츮���� ȭ���������� �ش� ������ ǥ���ϴ� ���α׷� �Դϴ�.
 * �������, 125,520 ���� �Է��ϸ� ȭ�鿡 �̷��� ���̰� �ϸ� �˴ϴ�.
 * ǥ���ϰ� 10�� �̸��� ����
 * *************************************************
 * ��û�ݾ� : 126520 ��
 * 5���� : 2��
 * 1���� : 2��
 * 5õ�� : 1��
 * 1õ�� : 1��
 * 5��� : 1��
 * ��� : 0��
 * ���ʿ� : 0��
 * �ʿ� : 2�� 
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
		System.out.println("�ݾ��� �Է����ּ���.");
		int input = sc.nextInt();
		System.out.println("�Է¹��� �ݾ� : "+ input+" ��");
		
//		int five_manwon=input/50000;
//		System.out.println("5���� : " +five_manwon+" ��");
//		
//		int one_manwon= (input-(50000*five_manwon))/10000;
//		System.out.println("1���� : "+one_manwon+" ��");
//		
//		int five_cheonwon= (input-(50000*five_manwon)-(10000*one_manwon))/5000;
//		System.out.println("5õ�� : "+five_cheonwon+" ��");
//		
//		int one_cheonwon= (input-(50000*five_manwon)-(10000*one_manwon)-(5000*five_cheonwon))/1000;
//		System.out.println("1õ�� : "+one_cheonwon+" ��");
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
			System.out.println("5���� : "+money.five_manwon+" ��");
			System.out.println("1���� : "+money.one_manwon+" ��");
			System.out.println("5õ�� : "+money.five_cheonwon+" ��");
			System.out.println("1õ�� : "+money.one_cheonwon+" ��");
			System.out.println("5��� : "+money.five_h_won+" ��");
			System.out.println("1��� : "+money.one_h_won+" ��");
			System.out.println("5�ʿ� : "+money.fifty_won+" ��");
			System.out.println("1�ʿ� : "+money.ten_won+" ��");
			
	}
}
