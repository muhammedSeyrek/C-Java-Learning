package springIntro;

import java.io.*;

public class binaryFiles {

	public static void main(String[] args) throws IOException{
		char array[] = {'x', 'y', 'z'};
		File file = new File("C:\\Users\\Seyrek\\eclipse-workspace\\springIntro\\src\\springIntro\\File.bin");
		ObjectOutputStream bFile = new ObjectOutputStream(new FileOutputStream(file));
		bFile.writeObject(array);
		bFile.close();
	}

}
