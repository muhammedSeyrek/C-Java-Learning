package springIntro;

public class doubleNumbers {

	public static void main(String[] args) {
		int i;
		for(i = 0; i < 12; i++) {
			if(i % 2 == 1) {
				System.out.println("Tek Sayilar = ");
				System.out.print(i);
			}
			else {
				System.out.println(" ");
				System.out.println("Cift Sayilar");
				System.out.println(i);
			}
			System.out.println("\n");
		}
	}

}
