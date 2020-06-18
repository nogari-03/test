package matrix;

import java.util.Scanner;

class BelPhone {
}
class CelPhone {
}
class Iphone extends CelPhone{
	public final static String KIND = "아이폰";
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
			System.out.println("0.종료 1.집전화걸기 2.전화받기 3.휴대폰걸기"
					+ "4. 아이폰 서치");
			switch(scanner.nextInt()) {
			case 0: return;
			case 1:
				phone = new BelPhone();
			}
		}
	}
}
	
}