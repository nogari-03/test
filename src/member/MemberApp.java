package member;

import java.util.Scanner;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();	
		MemberService memberService = new MemberServiceImpl();
		
		while(true) {
			System.out.println("��ȣ�� �Է����ּ���");
			System.out.println("0: �ý��� ���� 1: �α��� 2: ȸ������");
			
			switch(scanner.nextInt()) {
			case 0 :
				System.err.println("����");
				return;
			case 1 :
				System.out.println("�α���");
				break;
			case 2 :
				System.out.println("ȸ������");
				System.out.println("���̵� : ");
				member.setUserid(scanner.next());
				System.out.println("��й�ȣ");
				member.setPassword(scanner.next());
				System.out.println("�̸� : ");
				member.setName(scanner.next());
				System.out.println("*******���� Ȯ��*******");
				System.out.println(member.toString());
				memberService.join(member);
				break;
			default :
				System.out.println("�޴��� ���� ���");
				break;
			}
			
		}
	}

}
