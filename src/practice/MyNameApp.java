package practice;

import java.util.Scanner;

public class MyNameApp {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Person person = new Person();
		
		System.out.println("이름이 뭡니까?");
		person.name = scanner.next();
		
		System.out.println("나이는 어떻게 되세요?");
		person.age = scanner.nextInt();
		
		System.out.println("키는 어떻게 되세요?");
		person.height = scanner.nextFloat();
		
		person.printStates();
		
	}
}