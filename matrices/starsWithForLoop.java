package springIntro;

import java.util.*;

public class starsWithForLoop {

	public static void main(String[] args) {
		char stars[][] = new char[9][9];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(i == j || (i + j) == 8) {
					stars[i][j] = '*';
					System.out.printf("%c", stars[i][j]);
				}
				else {
					stars[i][j] = ' ';
					System.out.printf("%c", stars[i][j]);
				}
			}
			System.out.printf("\n");
				
		}
			
	}

}