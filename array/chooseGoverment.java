package springIntro;

public class chooseGoverment {

	public static void main(String[] args) {
		String name[] = {"Muhammed", "Merve", "Ahmet", "Abdullah", "Hayrettin", "Serafettin", "Yakup"};
		int vote[] = new int [7];
		for(int i = 0; i < 7; i++) {
			vote[i] = (int) (Math.random() * 100) + 1;
			System.out.printf("%s = ", name[i]);
			System.out.printf("%d\n", vote[i]);
		}
		System.out.printf("\n");
		int smaller;
		String smallerN;
		int inLine[] = new int[7];
		for(int i = 0; i < 6; i++) {
			for(int j = i + 1; j < 7; j++) {
				if(vote[i] > vote[j]) {
					smallerN = name[j];
					name[j] = name[i];
					name[i] = smallerN;
					smaller = vote[j];
					vote[j] = vote[i];
					vote[i] = smaller;
				}
			}
		}
		inLine = vote;
		for(int i = 0; i < 7; i++) {
			System.out.printf("%s = %d\n", name[i], inLine[i]);
		}
	}
}
