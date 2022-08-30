package springIntro;

public class thueMorseArray {

	static String thueMorse(int n) {
		if(n == 0)
			return "0";
		String tm = thueMorse(n - 1);
		String tm2 = "";
		for(int i = 0; i < tm.length(); i++)
			if(tm.charAt(i) == 0)
				tm2 += "01";
			else
				tm2 += "10";
		return tm2;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			System.out.println(thueMorse(i));
		}
	}

}
