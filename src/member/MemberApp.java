package member;

import java.util.Scanner;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();	
		MemberService memberService = new MemberServiceImpl();
		
		while(true) {
			System.out.println("번호를 입력해주세요");
			System.out.println("0: 시스템 종료 1: 로그인 2: 회원가입");
			
			switch(scanner.nextInt()) {
			case 0 :
				System.err.println("종료");
				return;
			case 1 :
				System.out.println("로그인");
				break;
			case 2 :
				System.out.println("회원가입");
				System.out.println("아이디 : ");
				member.setUserid(scanner.next());
				System.out.println("비밀번호");
				member.setPassword(scanner.next());
				System.out.println("이름 : ");
				member.setName(scanner.next());
				System.out.println("*******정보 확인*******");
				System.out.println(member.toString());
				memberService.join(member);
				break;
			default :
				System.out.println("메뉴에 없는 기능");
				break;
			}
			
		}
	}

}
