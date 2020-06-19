package one;

import java.util.Scanner;

/**
 * RFP
 * Person(id, pass, name) 
 * 				- Student(ssn:String,score:int)
 * 				- Admin(rank: int)
 * <사용자 기능> Student
 * 1. 회원가입
 * 2. 로그인
 * 3. 비번수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 마이페이지
 * *************************
 * <관리자 기능> Admin
 * 1. 회원목록
 * 2. 아이디검색
 * 3. 이름검색
 * 4. 전체 회원수
 * 5. 성적별 현황 (스코어 기준 이름 내림차순 예.. 1등 이순신(여) 98점, 2등 김유신(남) 85점 ...)
 * 
 */

public class PersonApp {
	public static void main(String[] args) {
		
		ServiceImpl service = new ServiceImpl();
		Student student = null;
		int func=0;
		
		Scanner sc = new Scanner(System.in);
		boolean work = true;
		try{
			while(work) {
			System.out.println("회원선택");
			System.out.println("0.종료 1.학생 2.관리자");
			int select = sc.nextInt();
			
			if(select==0) {
				work=false;
			}else if(select==1){
					student = new Student();
					System.out.println("회원기능선택");
					System.out.println("1.회원가입 2.로그인 3.비번수정 4.회원탈퇴 5.아이디 존재 체크 6.마이페이지");
					func=sc.nextInt();
					switch(func) {
						case 1:
							service.join(student);break;
						case 2:
							service.login(student);break;
						case 3:
							service.changePw(student);break;
						case 4:
							service.withdrawal(student);break;
						case 5:
							System.out.println("아이디 입력");
							service.exitstId(sc.next());break;
						case 6:
							System.out.println("아이디 입력");
							service.myPage(sc.next());break;
						default:
							System.out.println("메뉴에 없는 기능입니다.");
							break;
					}
					
			}else if(select==2) {				
					System.out.println("관리자기능선택");
					System.out.println("1.회원목록 2.아이디검색 3.이름검색 4.전체 회원수 5.성적별 현황");
					func=sc.nextInt();
					switch(func) {
						case 1:
							service.list();break;
						case 2:
							System.out.println("아이디 입력");
							student = new Student();
							student = service.idSearch(sc.next());
							System.out.println(student.toString());
							break;
						case 3:
							System.out.println("이름 입력");
							service.nameSearch(sc.next());
							break;
						case 4:
							service.count();break;
						case 5:
							service.sort();break;
						default:
							System.out.println("메뉴에 없는 기능입니다.");
							break;
			}
		}
	}
} catch (Exception e) {
	System.out.println("오류");
}
}
}