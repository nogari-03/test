package matrix;

public class Teams {
	public static void main(String[] args) {
		String[] team1 = {"�浿","����","��â","ö��"};
		String[] team2 = {"��","���ӽ�","Į","�κ�"};
		String[] team3 = {"������","��ȣ","�¾�","�º�"};
		String[] team4 = {"����","�ι�","���","����"};

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
