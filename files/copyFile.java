package springIntro;

import java.io.*;

public class copyFile {

	public static void main(String[] args) throws IOException{
		try {
			File file1 = new File("C:\\Users\\Seyrek\\eclipse-workspace\\springIntro\\src\\springIntro\\text.txt");
			File file2 = new File("C:\\Users\\Seyrek\\eclipse-workspace\\springIntro\\src\\springIntro\\text2.txt");
			BufferedReader rd = new BufferedReader(new FileReader(file1));
			BufferedWriter cp = new BufferedWriter(new FileWriter(file2));
			String line;
			while((line = rd.readLine()) != null) {
				cp.write(line);
				cp.newLine();
			}
			cp.flush();
			cp.close();
			rd.close();
		} catch (IOException ioe) {
			// TODO: handle exception
		}
	}

}
