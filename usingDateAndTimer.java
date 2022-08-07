package springIntro;
import java.util.*;
public class usingDateAndTimer {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Time since october 22, 2000 " + today.getTime() + " mili saniyedir");
		System.out.printf("Same value ..:%s\n",System.currentTimeMillis());
		System.out.printf("Normal format %s \n",today);
		System.out.printf("Turkish format: %tc \n",today);
		System.out.printf("AA/GG/YY format: %tD \n",today);
		System.out.printf("Just time	: %tR \n",today);
	}
}