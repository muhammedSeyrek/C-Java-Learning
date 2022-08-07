package springIntro;
import java.util.*;

import javax.swing.JOptionPane;
public class usingInputProcess {
	public static void main(String[] args) {
		/*System.out.println("Enter the name");
		String message = new Scanner(System.in).next();
		System.out.println(message);
		*/
		String message2 = JOptionPane.showInputDialog(null, "Enter the name?");
		JOptionPane.showInputDialog(null, message2);
	}
}
