package Exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyChar {
	public static void main(String[] args) throws IOException {
		String source,destination,line,content="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the source file name: ");
		source=sc.nextLine();
		FileReader filereader=new FileReader(source);
		BufferedReader bufferedreader=new BufferedReader(filereader);
		for(line=bufferedreader.readLine(); line!=null; line=bufferedreader.readLine())
		{
				content=content+line+"\n";
		}
		bufferedreader.close();
		System.out.println("Enter the destination file name: ");
		destination=sc.nextLine();
		FileWriter filewriter=new FileWriter(destination);
		filewriter.write(content);
		filewriter.close();
		System.out.println("File copied successfully...");
	}
}
