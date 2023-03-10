package Exercise7;

import java.io.*;
import java.util.Date;

public class DateObject {
	public static void main(String[] args) {
		Date date = new Date();
		String string = date.toString();
		try {
			FileWriter fileWriter = new FileWriter("date.txt");
			fileWriter.write(date.toString());
			System.out.println("Written date to file successfully...");
		} catch (Exception e) {
			System.out.println("Failed to write date object to file...");
		}
		try {
			FileReader fileReader = new FileReader("date.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			System.out.println(bufferedReader.readLine());
		} catch (Exception e) {
			System.out.println("Failed to read date object from file...");
		}
	}
}
