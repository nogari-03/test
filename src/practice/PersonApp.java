package practice;

import java.util.Scanner;

public class PersonApp {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		Person[] persons = new Person[3];
//
//		Person person0 = new Person();
//		System.out.println("�̸��� ���ϱ�?");
//		person0.name = scanner.next();
//		System.out.println("���̴� ��� �Ǽ���?");
//		person0.age = scanner.nextInt();
//		System.out.println("Ű�� ��� �Ǽ���?");
//		person0.height = scanner.nextFloat();
//		persons[0] = person0;
//
//		Person person1 = new Person();
//		System.out.println("�̸��� ���ϱ�?");
//		person1.name = scanner.next();
//		System.out.println("���̴� ��� �Ǽ���?");
//		person1.age = scanner.nextInt();
//		System.out.println("Ű�� ��� �Ǽ���?");
//		person1.height = scanner.nextFloat();
//		persons[1] = person1;
//
//		Person person2 = new Person();
//		System.out.println("�̸��� ���ϱ�?");
//		person2.name = scanner.next();
//		System.out.println("���̴� ��� �Ǽ���?");
//		person2.age = scanner.nextInt();
//		System.out.println("Ű�� ��� �Ǽ���?");
//		person2.height = scanner.nextFloat();
//		persons[2] = person2;
//
//		for (int i = 0; i < 3; i++) {
//			persons[i].printStates();
//		}
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����Դϱ�?");
		int j = sc.nextInt();
		Person[] persons = new Person[j];
		for (int i = 0; i < j; i++) {
			Person person = new Person();
			System.out.println("�̸��� ���ϱ�");
			person.name = sc.next();

			System.out.println("���̰� ����Դϱ�");
			person.age = sc.nextInt();

			System.out.println("Ű�� ���Դϱ�");
			person.height = sc.nextFloat();

			persons[i] = person;
		}
		for (int i = 0; i < j; i++) {
			persons[i].printStates();
		}
	}
}