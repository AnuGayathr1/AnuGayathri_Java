package day4;
import java.io.FileReader;
public class derivedBase {
	public static void main(String[] args)throws Exception {
		FileReader file=new FileReader("Test.txt");
		System.out.println(file.read());
		file.close();
	}
}
class A extends derivedBase{
	A(){
	super();
	try {
		
	}catch(Exception e) {
		System.out.println("Exception...");
		//e.printStackTrace();
	}
	}
}