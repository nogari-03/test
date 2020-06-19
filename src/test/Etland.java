package test;

import java.util.Scanner;

/**
@author pakjkwan@gmail.com
@since 2020.06.18
@param kind ������ , company ������, call ��ȭ����
*/
class Product{
	
}
class TV extends Product{
	public final static String KIND = "�ڷ�����";
	@Override public String toString() {return String.format("%s", KIND);}
}
class ColorTV extends TV{
	public final static String KIND = "�÷� �ڷ�����";
	@Override public String toString() {return String.format("%s", KIND);}
}
class Computer extends Product{
	public final static String KIND = "��ǻ��";
	@Override public String toString() {return String.format("%s", KIND);}
}
class Notebook extends Computer{
	public final static String KIND = "��Ʈ��";
	@Override public String toString() {return String.format("%s", KIND);}
}

class BelPhone extends Product{
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
	public String toString(){return String.format("%s", KIND);}
}
class GalPhone extends Iphone{
	protected String pay;
	public final static String KIND = "������";
	public String getPay() {return pay;}
	public void setPay(String pay) {this.pay = pay;}
	
	@Override
	public String toString() {return String.format("%s", KIND);}
}

public class Etland{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Product item = null;
		Product[] cart = new Product[5];
		int index = 0;
		while(true) {
			System.out.println("���θ��: 0.���� 1.������ 2.������ 3. �÷�TV"
					+ "4. ��ǻ�� 5. ��Ʈ�� 6. ���θ�Ϻ���");
			switch (scanner.nextInt()) {
			case 0:return;
			case 1:cart[index] = new Iphone(); index++; break;
			case 2:cart[index] = new GalPhone(); index++; break;
			case 3:cart[index] = new ColorTV(); index++; break;
			case 4:cart[index] = new Computer(); index++; break;
			case 5:cart[index] = new Notebook(); index++; break;
			case 6: 
				System.out.println("���Ÿ��");
				for(Product p : cart) {
					System.out.println(p.toString());
				}
			
			default:
				break;
			}
		}
	}
}

