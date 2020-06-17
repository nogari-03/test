package matrix;

public class Gugudan {
	public static void main(String[] args) {
	
		int[][] arr = new int[9][9];
		int k =0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("");
			for(int j=0;i<arr[i].length;i++) {
				k += 2;
				arr[i][j] = k;
				System.out.println(k);
				
			}
		}
	}
}
