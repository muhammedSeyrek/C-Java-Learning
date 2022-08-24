package springIntro;

public class matricesProduct {

	public static void main(String[] args) {
		int matrix1[][] = {{2, 3, 5}, {6, 7, 8}, {9, 10, 11}};
		int matrix2[][] = {{1, 2, 7}, {6, 5, 4}, {3, 2, 1}};
		int product[][] = new int[3][3];
		int i = 0, j = 0, k = 0;
		while(i < 3) {
			j = 0;
			while(j < 3) {
				product[i][j] = 0;
				k = 0;
				while(k < 3) {
					product[i][j] += matrix1[i][k] * matrix2[k][j];
					k++;
				}
				System.out.printf("%d ", product[i][j]);
				j++;
			}
			System.out.printf("\n");
			i++;
		}
	}

}
