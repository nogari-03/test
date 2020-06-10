package practice;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] arr = new Student[3];
		for(int i=0;i<arr.length;i++) {
			Student student = new Student();
			
			System.out.println("이름을 입력해주세요 : ");
			student.setName(sc.next());
			
			System.out.println("국어 점수 : ");
			student.setKor(sc.nextInt());
			
			System.out.println("영어 점수 : ");
			student.setEng(sc.nextInt());
			
			System.out.println("수학 점수 : ");
			student.setMath(sc.nextInt());
			
			student.sum();
			student.avg();
			
			System.out.println("총점은 : "+student.sum);
			System.out.println("평균은 : "+student.avg);
		}
	}
}
