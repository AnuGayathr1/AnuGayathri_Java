package Exercise7;

import java.io.*;

public class FileCopyLine {
	public static void main(String[] args) throws IOException {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader("/Users/anugayathri/eclipse-workspace/Exercise7/file"));
			outputStream = new PrintWriter(new FileWriter("/Users/anugayathri/eclipse-workspace/Exercise7/copy"));

			String line;
			while ((line = inputStream.readLine()) != null) {
				outputStream.println(line);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
			System.out.println("File copied successfully...");
		}
	}
}

