package springIntro;

import java.io.*;

public class addedRecord {

	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\Seyrek\\eclipse-workspace\\springIntro\\src\\springIntro\\text.txt");
		BufferedWriter print = new BufferedWriter(new FileWriter(file, true));
		String str;
		str = "Yalniz seni, yalniz senin gozlerini";
		print.write(str);
		print.close();
	}

}
