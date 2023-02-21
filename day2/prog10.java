package day2;

public class prog10 {
	public static void main(String[] args) {
		Cc cobj=new Cc();
	}
}
class Aa{
	Aa(){
		System.out.println("Inside Constructor A");
	}
}
class Bb{
	Bb(){
		System.out.println("Inside Constructor B");
	}
}
class Cc extends Aa{
	Bb b;
	
}