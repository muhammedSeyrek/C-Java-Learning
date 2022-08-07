package springIntro;
import java.util.Scanner;

public class donationAmount {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int donation = input.nextInt();
		boolean volunteer = false;
		if(donation > 1000) {
			if(volunteer == false)
				System.out.print("file");
			else
				System.out.print("Write the name");
		}
	}

}
