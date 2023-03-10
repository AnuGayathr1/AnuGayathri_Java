package Exercise7;

import java.io.*;

import java.nio.file.*;

public class FileSize {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/Users/anugayathri/eclipse-workspace/Exercise7/rename");
		long size = Files.size(path);
		System.out.println("File: " + path + "Size: " + size + " bytes");
	}
}
