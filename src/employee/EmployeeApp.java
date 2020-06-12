package employee;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Employee employee = null;
			EmployeeService employeeService = new EmployeeServiceImpl();
			while(true) {
				System.out.println("0 종료, 1 가입, 2 로그인");
				switch(scanner.nextInt()) {
				case 0 : System.out.println("종료");return;
				case 1:
					System.out.println("출근");
					employee = new Employee();
//					System.out.println(: ");
//					employee.setName(scanner.next());
//					employeeService.join(employee);
//					break;
//				case 2:
//					System.out.println("출근목록");
//					Employee[] list = employeeService.list();
//					for(int i=0; i< list.length;i++) {
//						System.out.println(list[i].toString());
//					}
//					break;
//				default:
//					System.out.println("잘못된 메뉴번호입니다.");
//					break;
				}
			}
		}

	}
