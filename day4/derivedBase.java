package day4;

public class derivedBase  {
	public derivedBase() throws Exception{
		throw new Exception();
	}
	public static void main(String[] args)throws Exception {
		
		A d=new A();	
		}
}

class A extends derivedBase{
	public A() throws Exception{
	super();
	try {
		
	}catch(Exception e) {
		System.out.println("Exception...");
		//e.printStackTrace();
	}
	}
}