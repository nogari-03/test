package sequence;

import java.util.Scanner;

/**
 * 1���� �����ϰ��� �ϴ� �Ѱ� ���ڸ� �Է��Ͻÿ�.
 * 1���� �ջ��� ����(����) ���������� Ȧ���� ���� ����Ͻÿ�.
 */
public class InputSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ѱ谪 �Է�");
		int lim = sc.nextInt();
		int sum = 0;
		for(int i=0; i<lim; i++) {
			if(i%2==0) {
				i=i+i;
				System.out.println(i);
			}
			sum += (i+1);
		}
	}
}
