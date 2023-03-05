package Exercise7;

import java.io.*;
import java.util.Date;

public class DateObject {
	public static void main(String[] args) {
		Date date=new Date();
		String string=date.toString();
		try(FileWriter filewriter=new FileWriter("date.txt");)
		{
			filewriter.write(date.toString());
			System.out.println("Written date to file successfully...");
		}catch(Exception e) {
			System.out.println("Failed to write date object to file...");
		}
		try(FileReader filereader=new FileReader("date.txt");
				BufferedReader bufferedreader=new BufferedReader(filereader);){
			System.out.println(bufferedreader.readLine());
		}
		catch(Exception e) {
			System.out.println("Failed to read date object from file...");
		}
}
}
