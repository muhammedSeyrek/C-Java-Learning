package springIntro;

import java.io.*;

public class readFileTwo {

	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\Seyrek\\eclipse-workspace\\springIntro\\src\\springIntro\\text.txt");
		BufferedReader read = new BufferedReader(new FileReader(file));
		while(true) {
			if(! read.ready())
				break;
			String str = read.readLine();
			System.out.println(str);
		}
	}

}
