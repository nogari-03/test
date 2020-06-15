package member;

import java.util.Scanner;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();	
		MemberService memberService = new MemberServiceImpl();
		String result = "";
		
		while(true) {
			System.out.println("번호를 입력해주세요");
			System.out.println("0:종료 1:회원가입 2:로그인 3:회원목록");
			
			switch(scanner.nextInt()) {
			case 0 :
				System.err.println("종료");
				return;
			case 1 :
				member = new Member();
				System.out.println("회원 가입");
				member.setUserid(scanner.next());
				System.out.println("비밀번호");
				member.setPassword(scanner.next());
				System.out.println("이름 :");
				member.setName(scanner.next());
				memberService.join(member);
				break;
			case 2 :
				System.out.println("로그인");
				member = new Member();
				System.out.println("아이디: ");
				member.setUserid(scanner.next());
				System.out.println("비밀번호 :");
				member.setPassword(scanner.next());
				memberService.login(member);
				break;
			case 3 :
				System.out.println("목록 보기");
				Member[] list= memberService.list();
				for(int i=0;i<3;i++) {
					System.out.println(list[i].toString());
				}
			case 4 :
				System.out.println("아이디 체크");
				member = new Member();
				System.out.println("아이디:");
				member.setUserid(scanner.next());
				result = memberService.existId(member);
				System.out.println(result);
				break;
			default :
				System.out.println("메뉴에 없는 기능");
				break;
			}
			
		}
	}

}
