package practice;

import java.util.Scanner;

public class PersonApp {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		Person[] persons = new Person[3];
//
//		Person person0 = new Person();
//		System.out.println("이름이 뭡니까?");
//		person0.name = scanner.next();
//		System.out.println("나이는 어떻게 되세요?");
//		person0.age = scanner.nextInt();
//		System.out.println("키는 어떻게 되세요?");
//		person0.height = scanner.nextFloat();
//		persons[0] = person0;
//
//		Person person1 = new Person();
//		System.out.println("이름이 뭡니까?");
//		person1.name = scanner.next();
//		System.out.println("나이는 어떻게 되세요?");
//		person1.age = scanner.nextInt();
//		System.out.println("키는 어떻게 되세요?");
//		person1.height = scanner.nextFloat();
//		persons[1] = person1;
//
//		Person person2 = new Person();
//		System.out.println("이름이 뭡니까?");
//		person2.name = scanner.next();
//		System.out.println("나이는 어떻게 되세요?");
//		person2.age = scanner.nextInt();
//		System.out.println("키는 어떻게 되세요?");
//		person2.height = scanner.nextFloat();
//		persons[2] = person2;
//
//		for (int i = 0; i < 3; i++) {
//			persons[i].printStates();
//		}
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명입니까?");
		int j = sc.nextInt();
		Person[] persons = new Person[j];
		for (int i = 0; i < j; i++) {
			Person person = new Person();
			System.out.println("이름이 뭡니까");
			person.name = sc.next();

			System.out.println("나이가 몇살입니까");
			person.age = sc.nextInt();

			System.out.println("키가 몇입니까");
			person.height = sc.nextFloat();

			persons[i] = person;
		}
		for (int i = 0; i < j; i++) {
			persons[i].printStates();
		}
	}
}