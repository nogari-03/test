package practice;

public class insertionSort {
	public static void main(String[] args) {
		int[] a = {235,12,4,5,2,123,6,24,2525,134,2};
		int b,j;
		for(int i = 1; i < a.length; i++) {
			b = a[i];
			for(j = i-1; j>= 0 && a[j]>b; j--) {
				a[j+1] = a[j];
			}
			a[j+1]=b;
		}
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}