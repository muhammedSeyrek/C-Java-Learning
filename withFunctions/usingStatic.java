package springIntro;

public class usingStatic {
	static int a= 9;
	static int go() {
		a += 5;
		return a;
	}
	
	public static void main(String[] args) {
		int b = go();
		System.out.println("First Result = " + b);
		b = go();
		System.out.println("Second Result = " + b);

	}

}
