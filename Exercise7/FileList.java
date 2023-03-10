package Exercise7;

import java.io.File;

public class FileList {
	public void printFileNames(File[] a, int i) {
		if (i == a.length) {
			return;
		}
		if (a[i].isFile()) {
			System.out.println(a[i].getName());
		}
		printFileNames(a, i + 1);
	}

	public static void main(String[] args) {
		String path = "/Users/anugayathri/eclipse-workspace/Exercise7";
		File fObj = new File(path);
		FileList obj = new FileList();
		if (fObj.exists() && fObj.isDirectory()) {
			File a[] = fObj.listFiles();
			System.out.println("Displaying Files from the directory : " + fObj);
			obj.printFileNames(a, 0);
		}
	}
}
