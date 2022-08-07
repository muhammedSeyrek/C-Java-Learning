package springIntro;

import java.util.*;

public class letterGrade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		number /= 10;
		switch(number) {
		case 10:
		case 9:
			System.out.println("AA");
			break;
		case 8:
			System.out.println("BA");
			break;
		case 7:
			System.out.println("BB");
			break;
		case 6:
			System.out.println("CB");
			break;
		case 5:
			System.out.println("CC");
			break;
		default:
			System.out.println("FF");
			break;
		}
	}

}
