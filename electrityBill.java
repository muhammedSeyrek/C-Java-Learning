package springIntro;

import java.util.*;

public class electrityBill {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter electric location = (1 = Workplace - 0 = Domicile)");
		int place = in.nextInt();
		System.out.println("Time spend");
		int time = in.nextInt();
		float price = 0;
		switch(place) {
		case 0:
			price = time * 2;
			break;
		case 1:
			if(time < 50)
				price = time * 1;
			else if(time > 50 && time < 100)
				price = ((time - 50) * 2) + 50;
			else if(time > 100)
				price = ((time - 100) * 3) + 150;
			break;
		default:
			break;
		}
		System.out.println("Bill price = " + price);
	}

}
