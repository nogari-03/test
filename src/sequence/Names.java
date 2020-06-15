package sequence;

public class Names {
	public static void main(String[] args) {
		String[] names = {"a","b","c","d","e"};
		//ace ¸¦ Ãâ·Â
		for(int i=0;i<names.length;i++) {
			if(i%2 == 0) {
				System.out.println(names[i]);
			}
		}
	}
}
