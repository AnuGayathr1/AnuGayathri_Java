package Exercise7;

import java.io.File;

public class FileRename {
	public static void main(String[] args) {
		File name = new File("/Users/anugayathri/eclipse-workspace/Exercise7/name");
		File rename = new File("/Users/anugayathri/eclipse-workspace/Exercise7/rename");
		if (name.renameTo(rename)) {
			System.out.println("File renamed successfully...");
		} else {
			System.out.println("Failed to rename the file...");
		}
	}
}

