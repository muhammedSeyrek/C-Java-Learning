package springIntro;

public class doubleDUsing {

	public static void main(String[] args) {
		int array[][] = new int[3][4];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) { 
				System.out.printf("%d ", (i * 4) + (j + 1));
			}
			System.out.printf("\n");
		}
	}

}
