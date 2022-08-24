package springIntro;

public class matricesSum {

	public static void main(String[] args) {
		int matrix1[][] = {{3, 5, 9}, {4, 6, 1}, {1, 8, 2}};
		int matrix2[][] = {{1, 0, 3}, {4, 5, 7}, {2, 3, 6}};
		int i = 0, j = 0;
		while(i < 3) {
			while(j < 3) {
				System.out.printf("%d ", matrix1[i][j] + matrix2[i][j]);
				j++;
			}
			System.out.printf("\n");
			j = 0;
			i++;
		}
	}

}
