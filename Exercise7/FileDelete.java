package Exercise7;

import java.io.File;

public class FileDelete {
public static void main(String[] args) {
	File file=new File("/Users/anugayathri/eclipse-workspace/Exercise7/filetodelete");
	if(file.delete()) {
		System.out.println("File deleted successfully...");
	}else {
		System.out.println("Failed to delete the file...");
	}
}
}
