package matrix;

import java.util.Scanner;

class BelPhone {
}
class CelPhone {
}
class Iphone extends CelPhone{
	public final static String KIND = "������";
	protected String search;
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
public class Phone{
	public void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BelPhone phone = null;
		BelPhone[] ar = new BelPhone[1];
		CelPhone cel = null;
		while(true) {
			System.out.println("0.���� 1.����ȭ�ɱ� 2.��ȭ�ޱ� 3.�޴����ɱ�"
					+ "4. ������ ��ġ");
			switch(scanner.nextInt()) {
			case 0: return;
			case 1:
				phone = new BelPhone();
			}
		}
	}
}
	
}