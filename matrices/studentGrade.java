package springIntro;

import java.util.*;

public class studentGrade {

	public static void main(String[] args) {
		int array[][] = new int[10][7];
		double avarage = 0;
		for(int i = 0; i < 10; i++) {
			int sum = 0;
			array[i][0] = i + 1; 
			for(int j = 1; j < 6; j++) {
				array[i][j] = (int) (Math.random() * 100) + 1;
			}
			avarage = (((array[i][1] * 15 / 100) + (array[i][2] * 15 / 100) + (array[i][3] * 20 / 100) + 
					(array[i][4] * 50 / 100)) * 30  / 100  + (array[i][5]) * 70 / 100);
			array[i][6] = (int)Math.round(avarage);
		}
		System.out.printf("No\tExam1\tExam2\tHwork\tMidT\tFinal\tSGrade\n\n");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 7; j++) {
				System.out.printf("%d\t", array[i][j]);
			}
			System.out.println();
		}
	}

}
