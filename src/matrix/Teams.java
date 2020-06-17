package matrix;

public class Teams {
	public static void main(String[] args) {
		String[] team1 = {"길동","순신","강창","철수"};
		String[] team2 = {"톰","제임스","칼","로빈"};
		String[] team3 = {"제이콥","기호","승아","태빈"};
		String[] team4 = {"동준","로미","길수","영희"};

		for(int i=0; i< team1.length;i++) {
			System.out.println();
			for(int j=0;j<1;j++) {
				System.out.printf("%s\t",team1[i]);
				System.out.printf("%s\t",team2[i]);
				System.out.printf("%s\t",team3[i]);
				System.out.printf("%s\t",team4[i]);
			}
		}
	}
}
