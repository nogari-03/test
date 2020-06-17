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
			System.out.println("잘못된 값");
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
			System.out.printf("뽑힌 값: %d\n", temp);
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
		System.out.println("구매한도 설정");
		instance.setCountLimit(scanner.nextInt());
		System.out.printf("설정된 구매한도 %d 장\n", instance.getCountLimit());
		while(true) {
			System.out.println("0.종료 1.로또구입");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("로또구입\n");buyLottos(instance,scanner);break;	
			}
		}
	}
	public static void buyLottos(Lotto instance, Scanner scanner) {
		System.out.println("얼마치를 구입합니까?");
		System.out.printf("로또 %d장을 발급합니다.\n", instance.lottoCount(scanner.nextInt()));
	}
}
