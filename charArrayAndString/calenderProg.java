package springIntro;

import java.util.*;

public class calenderProg {

	public static void main(String[] args) {
		char calender[][][] = new char[12][31][10];
		String season[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", 
				"October" ,"November", "December"};
		int counter = 0;
		for(int i = 0; i < 12; i++) {
			System.out.println("\n" + season[i]);
			for(int l = 0; l < (counter % 7); l++)
				System.out.printf("\t");
			for(int j = 0; j < 31; j++) {
				if((i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11)){
					System.out.printf(" " + String.valueOf(j + 1) + "\t");
					counter++;
				}
				if(i == 1 && j < 28){
					System.out.printf(" " + String.valueOf(j + 1) + "\t");
					counter++;
				}
				if((i == 3 || i == 5 || i == 8 || i == 10) && j < 30){
					System.out.printf(" " + String.valueOf(j + 1) + "\t");
					counter++;
				}
				if(counter % 7 == 0)
					System.out.println();
				
			}
			System.out.println();
		}
	}

}
