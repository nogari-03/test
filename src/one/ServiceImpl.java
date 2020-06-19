package one;

import java.util.Scanner;

public class ServiceImpl implements Service {
	
	Scanner sc = new Scanner(System.in);
	
	private Student[] students= new Student[100];
	private int count=0;
	String result;
	
	@Override
	public void join(Student student) {
		System.out.println("���̵� �Է� : ");
			student.setId(sc.next());
		System.out.println("��й�ȣ �Է� : ");
			student.setPassword(sc.next());
		System.out.println("�̸� �Է� : ");
			student.setName(sc.next());
		System.out.println("�ֹι�ȣ �Է� : ");
			student.setSsn(sc.next());
		System.out.println("���� �Է� :");
			student.setScore(sc.nextInt());
			
			students[count] = student;
			count++;
		
		System.out.println("ȸ������ �Ϸ�.");
	}
	@Override
	public void login(Student student) {
		
		this.input(student);
		
		result = "�α��� ����";
		for(int i=0; i< count; i++) {
			if(student.getId().equals(students[i].getId())
					&&
				student.getPassword().equals(students[i].getPassword())) {
				result = "�α��� ����";
				break;
			}
		}
		System.out.println(result);
	}
	@Override
	public void changePw(Student student) {
		
		this.input(student);
		
		result="���� ����";
		for(int i=0; i< count; i++) {
			if(student.getId().equals(students[i].getId())){
				if(student.getPassword().equals(students[i].getPassword())) {
					System.out.println("���ο� �н����带 �Է� : ");
					students[i].setPassword(sc.next());
					result="���� ����";
					}
				}
			}
		System.out.println(result);
	}
	@Override
	public void withdrawal(Student student) {
		
		this.input(student);
		
		result = "Ż�� ����";
		for(int i=0; i<count; i++) {
			if(student.getId().equals(students[i].getId())
					&& student.getPassword().equals(students[i].getPassword())) {
				result = "Ż�� ����";
			}
		}
		System.out.println(result);
	}
	@Override
	public void exitstId(String id) {
		
		String result = "�ߺ�����";
		for(int i=0; i< count; i++) {
			if(id.equals(students[i].getId())) {
				result = "�ߺ��� ���̵�";
			}
		}
		System.out.println(result);
	}
	@Override
	public void myPage(String id) {
		
		result = "�ҷ����� ����";
		for(int i=0; i<count; i++) {
			if(id.equals(students[i].getId())) {
				result="�ҷ����� �Ϸ�";
				System.out.println(students[i]);
			}
		}
		System.out.println(result);
	}
	
	@Override
	public Student input(Student student) {
		System.out.println("���̵� �Է����ּ���.");
		student.setId(sc.next());
		System.out.println("��й�ȣ�� �Է����ּ���.");
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
		System.out.println("�� "+cnt+" �� �Դϴ�.");
	}
	public void sort() {
		Student temp;
		String result="���� ����";
		for(int i=0;i<students.length-1;i++) {
			for(int j=i+1;j<students.length;j++) {
			if(students[i].getScore() < students[j].getScore()) {
				temp = students[i];
				students[i] = students[j];
				students[j] = temp;
				result="���� ����";
				}
			}
		}
		System.out.println(result);
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].getName()+"�� "+students[i].getScore()+"�� : "+i+" �� �Դϴ�.");
		}
		
	}
}
