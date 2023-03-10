package Exercise7;

import java.io.File;

public class FileList {
	public void printFileNames(File[] files, int index) {
		if (index == files.length) {
			return;
		}
		if (files[index].isFile()) {
			System.out.println(files[index].getName());
		}
		printFileNames(files, index + 1);
	}

	public static void main(String[] args) {
		String path = "/Users/anugayathri/eclipse-workspace/Exercise7";
		File file = new File(path);
		FileList fileList = new FileList();
		if (file.exists() && file.isDirectory()) {
			File files[] = file.listFiles();
			System.out.println("Displaying Files from the directory : " + file);
			fileList.printFileNames(files, 0);
		}
	}
}
