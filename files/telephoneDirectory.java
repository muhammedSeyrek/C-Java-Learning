package springIntro;

import java.util.*;

import java.io.*;

public class telephoneDirectory {
	private static int recS = 48;
	private static int nameS = 5;
	private static int surnameS = 10;
	private static int telS = 5;
	private static long rNo = 0;
	private static String name, surname, tel;
	static RandomAccessFile rFile;
	static Scanner in = new Scanner(System.in);
	//Ana program
	
	public static void addedR() throws IOException{
		rFile = new RandomAccessFile("directory.dat", "rw");
		String ans = "y";
		do {
			rNo++;
			System.out.print(rNo + ".record\n");
			in.nextLine();
			System.out.print("Name = \n");
			name = in.nextLine();
			System.out.print("Surname = \n");
			surname = in.nextLine();
			System.out.print("Tel number = \n");
			tel = in.nextLine();
			printR(rFile);
			System.out.printf("Move on ? (y/n)");
			ans = in.nextLine();
		}while(ans.equals("y") || ans.equals("Y"));
	}
	public static void printR(RandomAccessFile files) throws IOException{
		long fileP = (rNo - 1) * recS;
		files.seek(fileP);
		files.writeLong(rNo);
		printD(files, name, nameS);
		printD(files, surname, surnameS);
		printD(files, tel, telS);
	}
	public static void printD(RandomAccessFile files, String text, int field) throws IOException{
		int size = text.length();
		if(size <= field) {
			files.writeChars(text);
			for(int i = size; i < field; i++)
				files.writeChar(' ');
		}
		else {//String cok uzunsa
			files.writeChars(text.substring(0, field));
		}
	}
	public static void listR(RandomAccessFile files) throws IOException{
		System.out.printf("Writing Record\n");
		long recordNo = files.length() / recS;
		files.seek(0);
		System.out.println("====================");
		for(int i = 0; i < recordNo; i++) {
			rNo = files.readLong();
			name = readD(files, nameS);
			surname = readD(files, surnameS);
			tel = readD(files, telS);
			System.out.println(rNo + " " + name + "\t" + surname + "\t" + tel);
		}
		System.out.println("=========================");
	}
	
	public static String readD(RandomAccessFile files, int field) throws IOException{
		String value = "";
		for(int i = 0; i < field; i++) {
			value += files.readChar();
		}
		return value;
	}
	
	public static void main(String[] args) throws IOException{
		rFile = new RandomAccessFile("directory.dat", "rw");
		char ch;
		do {
			System.out.printf("[1] - Added record\n");
			System.out.printf("[2] - List record\n");
			System.out.println("[3] - Exit\n");
			ch = in.next().charAt(0);
			switch(ch) {
			case '1' : addedR(); break;
			case '2' : listR(rFile); break;
			case '3' : break;	
			}
		}while(ch != 3);
			rFile.close();
		}
	}


