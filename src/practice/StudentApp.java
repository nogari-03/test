package practice;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] arr = new Student[3];
		for(int i=0;i<arr.length;i++) {
			Student student = new Student();
			
			System.out.println("�̸��� �Է����ּ��� : ");
			student.setName(sc.next());
			
			System.out.println("���� ���� : ");
			student.setKor(sc.nextInt());
			
			System.out.println("���� ���� : ");
			student.setEng(sc.nextInt());
			
			System.out.println("���� ���� : ");
			student.setMath(sc.nextInt());
			
			student.sum();
			student.avg();
			
			System.out.println("������ : "+student.sum);
			System.out.println("����� : "+student.avg);
		}
	}
}
