package day2;
class Singleton{
	private static Singleton s=null;
	public String t;
	private Singleton() {
		t="Part of Singleton Class";
	}
	public static Singleton Singleton() {
		if(s==null) {
			s=new Singleton();
		}
		return s;
	}
}
public class Main {
	public static void main(String[] args) {
		Singleton x=Singleton.Singleton();
		Singleton y=Singleton.Singleton();
		Singleton z=Singleton.Singleton();
		System.out.println(x.t);
		System.out.println(y.t);
		System.out.println(z.t);
	}
}
