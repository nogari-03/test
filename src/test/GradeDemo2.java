package test;

import java.util.Scanner;

public class GradeDemo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸�");
		String name = scanner.next();
		System.out.println("����");
		final String ENG = "����";
		System.out.println("����");
		int score = scanner.nextInt();
		System.out.println("���");
		String grade ="";
		
		if(score>89) {
			grade = "A";
		}else if(score<90 && score>79) {
			grade = "B";
		}else if(score<80 && score>69) {
			grade = "C";
		}else if(score<70 && score>59) {
			grade = "D";
		}else if(score<60 && score>49) {
			
		}
			grade = "F";
		
		System.out.println("********************************");
		System.out.println("   �̸�   ����   ����   ���");
		System.out.println("--------------------------------");
		System.out.println(" |  "+name+"  |  "+ENG+"  |  "+score+"  |  "+grade+"  | ");
		System.out.println("********************************");
		
		scanner.close();
	}

}
