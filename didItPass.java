package springIntro;

import java.util.*;

public class didItPass {

	public static void main(String[] args) {
		int note;
		Scanner in = new Scanner(System.in);
		note = in.nextInt();
		if(note >= 50) 
			System.out.println("Pass");
		else 
			System.out.println("Left");
	}

}
