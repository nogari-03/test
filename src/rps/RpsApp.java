package rps;

import java.util.Scanner;

public class RpsApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위,바위,보를 고르세요.");
		System.out.println("1.가위 2.바위 3.보");
		int player = scanner.nextInt();
		int computer = 0;
		String result = "";
		System.out.println("**************************");
		System.out.println("플레이어" + player);
		System.out.println("컴퓨터" + computer);
		System.out.println("플레이어" + result);

		if(player>computer) {
			result="이겼습니다.";
		}else if(player==computer) {
			result="비겼습니다."
		}
	}

}
