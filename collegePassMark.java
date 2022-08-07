package springIntro;
import java.util.*;
public class collegePassMark {
	public static void main(String[] args) {
		int q1, q2, task, midterm, finalExam;
		Scanner Input = new Scanner(System.in);
		System.out.println("Please, enter the P.S");
		q1 = Input.nextInt();
		q2 = Input.nextInt();
		task = Input.nextInt();
		midterm = Input.nextInt();
		finalExam = Input.nextInt();
		float proccess = 0;
		proccess = (float)((q1 * 0.1) + (q2 * 0.1) + (task * 0.1) + (midterm * 0.4) + (finalExam * 0.3));
		System.out.println("Proccess = " + proccess);
	}
}
