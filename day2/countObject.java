package day2;

public class countObject {
	private static int count;
	public countObject()
	{
		count++;
	}
	public static void main(String[] args) {
		countObject x=new countObject();
		countObject y=new countObject();
		countObject z=new countObject();
		System.out.println("Total number of objects: "+count);
	}
}
