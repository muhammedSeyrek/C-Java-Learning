package springIntro;

import java.util.*;

public class outsideSeason {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month [] = {"Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran", "Temmuz", 
				"Agustos", "Eylul", "Ekim", "Kasim", "Aralik"};
		System.out.println("Enter a month number");
		int choose = in.nextInt();
		if(choose > 12)
			System.out.println("Error");
		else
			System.out.println(month[choose - 1]);
	}

}
