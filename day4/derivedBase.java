package day4;
import java.io.FileReader;
public class derivedBase  {
	public derivedBase() throws Exception{
		FileReader file=new FileReader("Test.txt");
		System.out.println(file.read());
		file.close();
	}
	public static void main(String[] args)throws Exception {
		
		derivedBase d=new derivedBase();	
		}
}

class A extends derivedBase{
	A() throws Exception{
	super();
	try {
		
	}catch(Exception e) {
		System.out.println("Exception...");
		//e.printStackTrace();
	}
	}
}