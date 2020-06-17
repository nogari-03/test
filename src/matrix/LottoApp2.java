package matrix;

import java.util.Random;


class Lotto2 {
		int[] arr;
}

public class LottoApp2 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		Lotto instance = new Lotto();
		for(int i=0; i< lotto.length; i++) {
			int temp = random.nextInt(45)+1;
			System.out.printf("»ÌÈù °ª: %d\n", temp);
			if(instance.isDuplication(lotto, temp)) {
				i--;
				continue;
			}
			lotto[i] = temp;
		}
		for(int i=0; i< lotto.length; i++) {
			System.out.printf("%d\t",lotto[i]);
		}
	}
}

