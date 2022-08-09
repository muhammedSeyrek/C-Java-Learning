package springIntro;

public class findSinus {

	static int fact(int x) {
		int i, f = 1;
		for(i = x; i >= 1; i--) {
			f = f * i;
		}
		return f;
	}
	
	public static void main(String[] args) {
		System.out.printf("Angle\tDegree\n");
		int pow, i, j, n = 15;
		float x, t;
		for(i = 0; i <= 90; i += 10) {
			t = 0;
			x = (float) ((float) i * Math.PI / 180);
			for(j = 0; j <= n - 1; j++) {
				pow = 2 * j + 1;
				t = (float) (t + Math.pow(-1, j) * Math.pow(x, pow) / fact(pow));
			}
			System.out.printf("%d\t%f\n", i, t);
		}
	}

}