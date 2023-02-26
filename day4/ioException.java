package day4;
import java.io.*;
public class ioException {
	public static void main(String[] args) {
		FileReader file=new FileReader("Test.txt");
		System.out.println(file.read());
		file.close();
	}
}
