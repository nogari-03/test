package practice;

import java.util.Scanner;

public class MyNameApp {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Person person = new Person();
		
		System.out.println("�̸��� ���ϱ�?");
		person.name = scanner.next();
		
		System.out.println("���̴� ��� �Ǽ���?");
		person.age = scanner.nextInt();
		
		System.out.println("Ű�� ��� �Ǽ���?");
		person.height = scanner.nextFloat();
		
		person.printStates();
		
	}
}