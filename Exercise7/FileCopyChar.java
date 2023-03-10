package Exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyChar {
	public static void main(String[] args) throws IOException {
		String source, destination, line, content = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the source file name: ");
		source = scanner.nextLine();
		FileReader fileReader = new FileReader(source);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		for (line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
			content = content + line + "\n";
		}
		bufferedReader.close();
		System.out.println("Enter the destination file name: ");
		destination = scanner.nextLine();
		FileWriter fileWriter = new FileWriter(destination);
		fileWriter.write(content);
		fileWriter.close();
		System.out.println("File copied successfully...");
	}
}
