package springIntro;

public class ourTimeSystem {

	public static void main(String[] args) {
		for(int i = 1; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 60; k++) {
					for(int l = 0; l < 60; l++) {
						System.out.println("Day = " + i + "-> " + j + ":" + k + ":" + l);
					}
				}
			}
		}

	}

}
