package springIntro;

import java.io.*;

public class readFile {

	public static void main(String[] args) throws IOException{
		int i;
		File file = new File("C:\\Users\\Seyrek\\eclipse-workspace\\springIntro\\src\\springIntro\\text.txt");
		FileInputStream read = new FileInputStream(file);
		do {
			i = read.read();
			if(i != -1)
				System.out.print((char) i);
		}while(i != -1);
		read.close();
	}

}
