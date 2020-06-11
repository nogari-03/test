package test;

import java.util.Scanner;

public class GradeDemo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름");
		String name = scanner.next();
		System.out.println("영어");
		final String ENG = "영어";
		System.out.println("점수");
		int score = scanner.nextInt();
		System.out.println("등급");
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
		System.out.println("   이름   영어   점수   등급");
		System.out.println("--------------------------------");
		System.out.println(" |  "+name+"  |  "+ENG+"  |  "+score+"  |  "+grade+"  | ");
		System.out.println("********************************");
		
		scanner.close();
	}

}
