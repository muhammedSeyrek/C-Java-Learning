package springIntro;

import java.util.*;

public class lessonsGrade {

	public static void main(String[] args) {
		int notes[][][] = new int[10][7][3];
		float avarage;
		for(int k = 0; k < 3; k++) {
			for(int i = 0; i < 10; i++) {
				notes[i][0][k] = i + 1;
				for(int j = 1; j < 6; j++) {
					notes[i][j][k] = (int) (Math.random() * 100) + 1;
				}
				avarage = (float) ((notes[i][1][k] * 0.15 + notes[i][2][k] * 0.15 + 
						notes[i][3][k] * 0.2 + notes[i][4][k] * 0.5) * 0.3 + notes[i][5][k] * 0.7);
				notes[i][6][k] = Math.round(avarage);
			}
		}
		System.out.printf("No\tExam1\tExam2\tHwork\tMidT\tFinal\tSGrade\n\n");
		for(int k = 0; k < 3; k++){
			if(k == 0){
				System.out.printf("Math\n\n");
			}
			else if(k == 1){
				System.out.printf("Physics\n\n");
			}
			else{
				System.out.printf("Chemistry\n\n");
			}
			for(int i = 0; i < 10; i++){
				for(int j = 0; j < 7; j++){
					System.out.printf("%d\t", notes[i][j][k]);
				}
				System.out.println();
			}
			System.out.printf("\n\n");
		}
	}

}
