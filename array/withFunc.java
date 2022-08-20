package springIntro;

import java.util.*;

public class withFunc {

	static int elements = 15;
	
	static void takeNotes(int notes[]) {
		int pass = 0, stay = 0;
		for(int i = 0; i < elements; i++) {
			if(notes[i] > 50) {
				pass++;
			}
			else {
				stay++;
			}
			System.out.print(notes[i] + " ");
		}
		System.out.printf("\nPass = %d\nStay = %d", pass, stay);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int notes[] = new int[elements];
		System.out.println("Enter notes");
		for(int i = 0; i < elements; i++) {
			notes[i] = in.nextInt();
		}
		takeNotes(notes);
	}

}
