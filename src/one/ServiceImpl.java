package one;

import java.util.Scanner;

public class ServiceImpl implements Service {
	
	Scanner sc = new Scanner(System.in);
	
	private Student[] students= new Student[100];
	private int count=0;
	String result;
	
	@Override
	public void join(Student student) {
		System.out.println("아이디 입력 : ");
			student.setId(sc.next());
		System.out.println("비밀번호 입력 : ");
			student.setPassword(sc.next());
		System.out.println("이름 입력 : ");
			student.setName(sc.next());
		System.out.println("주민번호 입력 : ");
			student.setSsn(sc.next());
		System.out.println("점수 입력 :");
			student.setScore(sc.nextInt());
			
			students[count] = student;
			count++;
		
		System.out.println("회원가입 완료.");
	}
	@Override
	public void login(Student student) {
		
		this.input(student);
		
		result = "로그인 실패";
		for(int i=0; i< count; i++) {
			if(student.getId().equals(students[i].getId())
					&&
				student.getPassword().equals(students[i].getPassword())) {
				result = "로그인 성공";
				break;
			}
		}
		System.out.println(result);
	}
	@Override
	public void changePw(Student student) {
		
		this.input(student);
		
		result="변경 실패";
		for(int i=0; i< count; i++) {
			if(student.getId().equals(students[i].getId())){
				if(student.getPassword().equals(students[i].getPassword())) {
					System.out.println("새로운 패스워드를 입력 : ");
					students[i].setPassword(sc.next());
					result="변경 성공";
					}
				}
			}
		System.out.println(result);
	}
	@Override
	public void withdrawal(Student student) {
		
		this.input(student);
		
		result = "탈퇴 실패";
		for(int i=0; i<count; i++) {
			if(student.getId().equals(students[i].getId())
					&& student.getPassword().equals(students[i].getPassword())) {
				result = "탈퇴 성공";
			}
		}
		System.out.println(result);
	}
	@Override
	public void exitstId(String id) {
		
		String result = "중복없음";
		for(int i=0; i< count; i++) {
			if(id.equals(students[i].getId())) {
				result = "중복된 아이디";
			}
		}
		System.out.println(result);
	}
	@Override
	public void myPage(String id) {
		
		result = "불러오기 실패";
		for(int i=0; i<count; i++) {
			if(id.equals(students[i].getId())) {
				result="불러오기 완료";
				System.out.println(students[i]);
			}
		}
		System.out.println(result);
	}
	
	@Override
	public Student input(Student student) {
		System.out.println("아이디를 입력해주세요.");
		student.setId(sc.next());
		System.out.println("비밀번호를 입력해주세요.");
		student.setPassword(sc.next());
		return student;
	}
	
	@Override
	public void list() {
		for(int i=0; i<students.length;i++) {
			System.out.println(students[i]);
		}
	}
	@Override
	public Student idSearch(String id) {
		Student student = new Student();
		for(int i=0; i< students.length; i++) {
			if(id.equals(students[i].getId())) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	@Override
	public void nameSearch(String name) {
		int cnt = 0;
		for(int i=0; i< students.length; i++) {
			if(students.equals(students[i].getName())) {
				cnt++;
			}
		}
		Student[] students = new Student[cnt];
		int k = 0;
		for(int i=0; i< students.length; i++) {
			if(name.equals(students[i].getName())) {
				students[k] = students[i];
				k++;
				if(k == cnt) break;
			}
		}
		System.out.println(students.toString());
	}
	public void count() {
		int cnt=students.length;
		System.out.println("총 "+cnt+" 명 입니다.");
	}
	public void sort() {
		Student temp;
		String result="정렬 실패";
		for(int i=0;i<students.length-1;i++) {
			for(int j=i+1;j<students.length;j++) {
			if(students[i].getScore() < students[j].getScore()) {
				temp = students[i];
				students[i] = students[j];
				students[j] = temp;
				result="정렬 성공";
				}
			}
		}
		System.out.println(result);
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].getName()+"는 "+students[i].getScore()+"점 : "+i+" 등 입니다.");
		}
		
	}
}
