package springIntro;

public class refferanceAndValue {
	static int number = 4;
	public static void main(String[] args) {
		valFunc(number);
		System.out.println("Value = " + number);
		refFunc(number);
		System.out.println("Referance = " + number);
		
	}
	static void refFunc(int number) {
		refferanceAndValue.number = 8;
	}
	static void valFunc(int number) {
		number = 8;
	}

}
