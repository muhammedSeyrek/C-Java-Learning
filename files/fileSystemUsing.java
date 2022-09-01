package springIntro;

import java.io.*;
import java.util.Scanner;

public class fileSystemUsing {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Seyrek\\eclipse-workspace\\springIntro\\src\\springIntro\\text.txt");
		file.createNewFile();//Dosyayi olustur
		FileWriter print = new FileWriter(file);
		Scanner in = new Scanner(System.in);
		System.out.println("Text to write to file");
		print.write(in.next());
		print.flush();//Veri akisini temizle
		print.close();//Dosyayi kapat
	}

}
