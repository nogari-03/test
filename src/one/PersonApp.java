package one;

import java.util.Scanner;

/**
 * RFP
 * Person(id, pass, name) 
 * 				- Student(ssn:String,score:int)
 * 				- Admin(rank: int)
 * <����� ���> Student
 * 1. ȸ������
 * 2. �α���
 * 3. �������
 * 4. ȸ��Ż��
 * 5. ���̵� ���� üũ
 * 6. ����������
 * *************************
 * <������ ���> Admin
 * 1. ȸ�����
 * 2. ���̵�˻�
 * 3. �̸��˻�
 * 4. ��ü ȸ����
 * 5. ������ ��Ȳ (���ھ� ���� �̸� �������� ��.. 1�� �̼���(��) 98��, 2�� ������(��) 85�� ...)
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
			System.out.println("ȸ������");
			System.out.println("0.���� 1.�л� 2.������");
			int select = sc.nextInt();
			
			if(select==0) {
				work=false;
			}else if(select==1){
					student = new Student();
					System.out.println("ȸ����ɼ���");
					System.out.println("1.ȸ������ 2.�α��� 3.������� 4.ȸ��Ż�� 5.���̵� ���� üũ 6.����������");
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
							System.out.println("���̵� �Է�");
							service.exitstId(sc.next());break;
						case 6:
							System.out.println("���̵� �Է�");
							service.myPage(sc.next());break;
						default:
							System.out.println("�޴��� ���� ����Դϴ�.");
							break;
					}
					
			}else if(select==2) {				
					System.out.println("�����ڱ�ɼ���");
					System.out.println("1.ȸ����� 2.���̵�˻� 3.�̸��˻� 4.��ü ȸ���� 5.������ ��Ȳ");
					func=sc.nextInt();
					switch(func) {
						case 1:
							service.list();break;
						case 2:
							System.out.println("���̵� �Է�");
							student = new Student();
							student = service.idSearch(sc.next());
							System.out.println(student.toString());
							break;
						case 3:
							System.out.println("�̸� �Է�");
							service.nameSearch(sc.next());
							break;
						case 4:
							service.count();break;
						case 5:
							service.sort();break;
						default:
							System.out.println("�޴��� ���� ����Դϴ�.");
							break;
			}
		}
	}
} catch (Exception e) {
	System.out.println("����");
}
}
}