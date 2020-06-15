package member;

import java.util.Scanner;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();	
		MemberService memberService = new MemberServiceImpl();
		String result = "";
		
		while(true) {
			System.out.println("��ȣ�� �Է����ּ���");
			System.out.println("0:���� 1:ȸ������ 2:�α��� 3:ȸ�����");
			
			switch(scanner.nextInt()) {
			case 0 :
				System.err.println("����");
				return;
			case 1 :
				member = new Member();
				System.out.println("ȸ�� ����");
				member.setUserid(scanner.next());
				System.out.println("��й�ȣ");
				member.setPassword(scanner.next());
				System.out.println("�̸� :");
				member.setName(scanner.next());
				memberService.join(member);
				break;
			case 2 :
				System.out.println("�α���");
				member = new Member();
				System.out.println("���̵�: ");
				member.setUserid(scanner.next());
				System.out.println("��й�ȣ :");
				member.setPassword(scanner.next());
				memberService.login(member);
				break;
			case 3 :
				System.out.println("��� ����");
				Member[] list= memberService.list();
				for(int i=0;i<3;i++) {
					System.out.println(list[i].toString());
				}
			case 4 :
				System.out.println("���̵� üũ");
				member = new Member();
				System.out.println("���̵�:");
				member.setUserid(scanner.next());
				result = memberService.existId(member);
				System.out.println(result);
				break;
			default :
				System.out.println("�޴��� ���� ���");
				break;
			}
			
		}
	}

}
