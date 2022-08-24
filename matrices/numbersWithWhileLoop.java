package springIntro;

public class numbersWithWhileLoop {

	public static void main(String[] args) {
		int numbers[][] = new int[5][5];
		int i = 0, j = 0;
		while(i < 5) {
			while(j < 5) {
				if(i == j || i + j == 4) {
					numbers[i][j] = i + 1;
					if(i == 2 &&  j == 2)
						numbers[i][j] = 6;
				}
				else {
					numbers[i][j] = 0;
				}
				j++;
			}
			j = 0;
			i++;
		}
		i = 0;
		j = 0;
		while(i < 5) {
			while(j < 5) {
				System.out.printf("%d ", numbers[i][j]);
				j++;
			}
			System.out.printf("\n");
			j = 0;
			i++;
		}
		
	}

}
