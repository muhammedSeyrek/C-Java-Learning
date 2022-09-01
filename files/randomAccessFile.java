package springIntro;

import java.io.*;

public class randomAccessFile {

	public static void main(String[] args) throws IOException{
		int data[] = {1, 4, 2, 5, 3, 9, 14, 19, 6, 13, 12};
		RandomAccessFile rFile = new RandomAccessFile("random.dat", "rw");
		for(int i = 0; i < data.length; i++) {
			rFile.writeInt(data[i]);//dizi elemanlarini dosyaya yaz
		}
		try {
			System.out.println("Lenght file " + rFile.length());
			rFile.seek(0);//1.kayitta konumlan
			System.out.println("First number " + rFile.readInt());
			rFile.seek(1 * 4);//2.kayitta konumlan
			System.out.println("Second number " + rFile.readInt());
			rFile.seek(10 * 4);//11.kayita konumlan
			System.out.println("11th number " + rFile.readInt());
			rFile.writeInt(54);//yeni kayit ekle
			rFile.seek(rFile.length());//kayit uzunlugunu sorgula
			System.out.println("Lenght of new file " + rFile.length());
			rFile.seek(11 * 4);//12.kayita konumlan
			System.out.println("12th number " + rFile.readInt());
		} catch (IOException e) {
			System.out.println("Error!!!");
		}
		
	}

}
