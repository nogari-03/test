package employee;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Employee employee = null;
			EmployeeService employeeService = new EmployeeServiceImpl();
			while(true) {
				System.out.println("0 ����, 1 ����, 2 �α���");
				switch(scanner.nextInt()) {
				case 0 : System.out.println("����");return;
				case 1:
					System.out.println("���");
					employee = new Employee();
//					System.out.println(: ");
//					employee.setName(scanner.next());
//					employeeService.join(employee);
//					break;
//				case 2:
//					System.out.println("��ٸ��");
//					Employee[] list = employeeService.list();
//					for(int i=0; i< list.length;i++) {
//						System.out.println(list[i].toString());
//					}
//					break;
//				default:
//					System.out.println("�߸��� �޴���ȣ�Դϴ�.");
//					break;
				}
			}
		}

	}
