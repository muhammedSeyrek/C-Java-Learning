package springIntro;
import java.util.*;
public class addedValueText {

	public static void main(String[] args) {
		System.out.print("Enter the price of the product = ");
		float price = new Scanner(System.in).nextInt();
		float proccess;
		proccess = (price + (price * 18) / 100);
		System.out.println("Result = " + proccess);
	}

}
