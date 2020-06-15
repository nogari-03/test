package employee;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Employee employee = null;
			EmployeeService employeeService = new EmployeeServiceImpl();
			while(true) {
				System.out.println("1 가입, 2 마이페이지, 3 비밀번호 수정");
				System.out.println("3 종료, 4 가입, 5 로그인");
				System.out.println("6 종료, 1 가입, 2 로그인");
				switch(scanner.nextInt()) {
				case 0 : System.out.println("종료");return;
				case 1:
					System.out.println("출근");
					employee = new Employee();
					break;
				}
			}
		}

	}
