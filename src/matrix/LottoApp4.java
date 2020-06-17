package matrix;

import java.util.Random;
import java.util.Scanner;

class Lotto{
	private int countLimit;
	
	public void setCountLimit(int countLimit) {
		this.countLimit = countLimit;
	}
	public int getCountLimit() {
		return countLimit;
	}
	public int lottoCount(int money) {
		int lottoCount = 0;
		if(money < 1000) {
			System.out.println("�߸��� ��");
		}else {
			if(money > countLimit * 1000) {
				lottoCount = countLimit;
			} else {
				lottoCount = money / 1000;
			}
		}
		return lottoCount;
	}
	public boolean isDuplication(int[] lotto, int num) {
		boolean ok = false;
		for(int i=0; i< lotto.length;i++) {
			if(lotto[i] == num) ok = true;
		}
		return ok;
	}
	public void generate(Random random, int[] lotto, Lotto instance) {
		for(int i=0; i< lotto.length; i++) {
			int temp = random.nextInt(45)+1;
			System.out.printf("���� ��: %d\n", temp);
			if(instance.isDuplication(lotto, temp)) {
				i--;
				continue;
			}
			lotto[i]=temp;
		}
	}
}
public class LottoApp4 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		Scanner scanner = new Scanner(System.in);
		Lotto instance = new Lotto();
		System.out.println("�����ѵ� ����");
		instance.setCountLimit(scanner.nextInt());
		System.out.printf("������ �����ѵ� %d ��\n", instance.getCountLimit());
		while(true) {
			System.out.println("0.���� 1.�ζǱ���");
			switch(scanner.nextInt()) {
			case 0: System.out.println("����");return;
			case 1: System.out.println("�ζǱ���\n");buyLottos(instance,scanner);break;	
			}
		}
	}
	public static void buyLottos(Lotto instance, Scanner scanner) {
		System.out.println("��ġ�� �����մϱ�?");
		System.out.printf("�ζ� %d���� �߱��մϴ�.\n", instance.lottoCount(scanner.nextInt()));
	}
}
