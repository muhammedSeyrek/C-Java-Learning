package springIntro;

public class zeroAndOneMinusOne {

	public static void main(String[] args) {
		int array[][] = new int[5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i > j)
					array[i][j] = -1;
				else if(i < j)
					array[i][j] = 1;
				else
					array[i][j] = 0;
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%d ", array[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
