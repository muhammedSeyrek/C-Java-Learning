package springIntro;

public class multiplicationTable {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.printf(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.printf("\n");
		}

	}

}
