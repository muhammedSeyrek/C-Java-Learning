package springIntro;
public class starsAndSharpWithNestedLoop {
	public static void main(String[] args) {
		int stars = 11, sharp = 23;
		for(int i = 0; i < stars; i++) {
			for(int j = 0; j < sharp; j++) {
				if(j > stars - i - 1 && j < stars + i + 1) {
					System.out.printf("*");
				}
				else {
					System.out.printf("#");
				}
			}
			System.out.printf("\n");
		}
	}
}