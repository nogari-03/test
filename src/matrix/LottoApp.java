package matrix;

import java.util.Arrays;
import java.util.Random;

public class LottoApp {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		
		for(int i=0; i< lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
				for(int j=i-1;j>=0;j--) {
					if(lotto[i]==lotto[j]) {
						i--;
						break;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		for(int i=0; i< lotto.length; i++) {
			System.out.printf("%d\t",lotto[i]);
		}
	}
}