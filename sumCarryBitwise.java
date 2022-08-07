package springIntro;

public class sumCarryBitwise {

	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		boolean sum = x ^ y;
		boolean get  = x & y;
		System.out.print("X\tY\tSum\tGet\n");
		System.out.print(x + "\t" + y + "\t" + sum + "\t" + get);
	}
}
