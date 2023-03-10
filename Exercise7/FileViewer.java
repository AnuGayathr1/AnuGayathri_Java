package Exercise7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class FileViewer {
	public static void main(String[] args) throws IOException {
		String filename;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name: ");
		filename=sc.nextLine();
		String line =null;
		FileReader filereader=new FileReader(filename);
		BufferedReader bufferedreader=new BufferedReader(filereader);
		while((line=bufferedreader.readLine())!=null) {
			System.out.println(line);
		}
		bufferedreader.close();
	}
}
