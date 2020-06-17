package sequence;

/*
 * 3의 배수를 제외한 1부터 10까지의 정수 출력
 * [결과] 1 2 4 5 7 8 10
 */
public class Except3Multi {
	public static void main(String[] args) {
		for(int i=1; i<11; i++) {
			if(i%3!=0) {
				System.out.print(i+" ");	
			}
		}
	}
}
