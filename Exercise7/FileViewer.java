package Exercise7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class FileViewer {
	public static void main(String[] args) throws IOException {
		String fileName;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the file name: ");
		fileName=scanner.nextLine();
		String line =null;
		FileReader fileReader=new FileReader(fileName);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		while((line=bufferedReader.readLine())!=null) {
			System.out.println(line);
		}
		bufferedReader.close();
	}
}
