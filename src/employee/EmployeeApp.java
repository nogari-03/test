package employee;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Employee employee = null;
			EmployeeService employeeService = new EmployeeServiceImpl();
			while(true) {
				System.out.println("1 ����, 2 ����������, 3 ��й�ȣ ����");
				System.out.println("3 ����, 4 ����, 5 �α���");
				System.out.println("6 ����, 1 ����, 2 �α���");
				switch(scanner.nextInt()) {
				case 0 : System.out.println("����");return;
				case 1:
					System.out.println("���");
					employee = new Employee();
					break;
				}
			}
		}

	}
