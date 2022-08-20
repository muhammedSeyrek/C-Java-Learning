package springIntro;

public class copyArrayChar {

	public static void main(String[] args) {
		char A[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
		char B[] = new char[9];
		int x = 8;
		for(int i = 0; i < 9; i++) {
			B[i] = A[x - i];
			System.out.printf("%c ",B[i]);
		}
	}

}
