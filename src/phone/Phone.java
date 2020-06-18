package phone;

import java.util.Scanner;

/**
@author pakjkwan@gmail.com
@since 2020.06.18
@param kind ������ , company ������, call ��ȭ����
*/
class BelPhone{
	protected String kind, company, call;

	public String getKind() {return kind;}
	public void setKind(String kind) {this.kind = kind;}
	public String getCompany() {return company;}
	public void setCompany(String company) {this.company = company;}
	public String getCall() {return call;}
	public void setCall(String call) {this.call = call;}
	@Override
	public String toString() {
		return "����ȭ�� [������=" + kind + ", ������=" + company + ", ��ȭ����=" + call + "]";
	} 
}
class CelPhone extends BelPhone{
	public final static String KIND = "�޴���";
	protected boolean portable;
	protected String move;

	public boolean isPortable() {return portable;}
	public void setPortable(boolean portable) {
		move = (portable) ? "�̵��߿�" : "�̵��Ұ���";
		this.portable = portable;
	}
	public String getMove() {return move;}
	public void setMove(String move) {this.move = move;}
	@Override
	public String toString() {
		return String.format("%s �� %s ��ǰ�� ����ؼ� %s ��� %s ��ȭ�Ѵ�",
				KIND, company, call, move);
	}
	
}
class Iphone extends CelPhone{
	public final static String KIND = "������";
	protected String search;
	public String getSearch() {return search;}
	public void setSearch(String search) {this.search = search;} 
	@Override
	public String toString() {
		return String.format("%s �������� ����ؼ� %s�߿� %s �� �Ѵ�",
				KIND, company, move, search);
	}
}
class GalPhone extends Iphone{
	protected String pay;
	public final static String KIND = "������";
	public String getPay() {return pay;}
	public void setPay(String pay) {this.pay = pay;}
	
	@Override
	public String toString() {
		return String.format("%s ������ ��ǰ�� ����ؼ�, %s�߿�  %s �Ѵ�",
				KIND, company, move, pay);
	}
}
public class Phone{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		BelPhone phone = null;
		BelPhone[] arr = new BelPhone[1];
		CelPhone cel = null;
		Iphone iphone = null;
		GalPhone gphone = null;
		while(true) {
			System.out.println("0.���� 1.����ȭ�ɱ� 2.��ȭ�ޱ� 3. �޴����ɱ�"
					+ "4. ������ ��ġ 5. �Ｚ���̰���");
			switch (scanner.nextInt()) {
			case 0:return;
			case 1:
				phone = new BelPhone();
				phone.setKind("����ȭ");
				phone.setCompany("�ݼ���");
				phone.setCall("�ȳ��ϼ���.");
				arr[0] = phone;
				break;
			case 2:
				System.out.println(arr[0].toString());
			case 3:
				cel = new CelPhone();
				cel.setCompany("��Ű��");
				cel.setPortable(true);
				cel.setCall("��ȭ�ϰ� �ִ�.");
				arr[0] = cel;
				break;
			case 4: 
				iphone = new Iphone();
				iphone.setCompany("����");
				iphone.setPortable(true);
				iphone.setSearch("���� �˻�");
				arr[0] = iphone;
				break;
			case 5: 
				gphone = new GalPhone();
				gphone.setCompany("�Ｚ");
				gphone.setPortable(true);
				gphone.setPay("�Ｚ���̰���");
				arr[0] = gphone;
				break;
			default:
				break;
			}
		}
	}
}
