package Exercise4;
import java.util.*;
public class VisitorDemo {
	public static void main(String[] args) throws DogExceptions {
		Scanner sc=new Scanner(System.in);
		Child c=new Child();
		Dog d=new Dog();
		System.out.println("Enter an item: ");
		String s=sc.next();
		c.PlayWithDog(s, d);
	}
}
class Child{
	public void PlayWithDog(String item, Dog dog) {
		System.out.println("Before exception...");
		try {
			dog.play(item);
		}catch(DogExceptions e) {
			e.printStackTrace();
			e.visit();
		}
		System.out.println("After exception...");
	}
}
class Dog{
	public void Play(String item) throws DogExceptions{
		if(item.equals("stick")) {
			throw new DogBarkExceptions("You beat I bite...");
		}
		else if(item.equals("stone")) {
			throw new DogBiteExceptions("You throw I bark...");
		}
		else if(item.equals("biscuit")) {
			throw new DogHappyExceptions("Happyyyyy");
		}
	}
}
abstract class ExceptionHandler{
	public abstract void handle(DogBarkExceptions e);
	public abstract void handle(DogBiteExceptions e);
	public abstract void handle(DogHappyExceptions e);
}
class Handler extends ExceptionHandler{
	@Override
	public void handle(DogBarkExceptions e) {
		// TODO Auto-generated method stub
		System.out.println("Bark...");
	}
	@Override
	public void handle(DogBiteExceptions e) {
		// TODO Auto-generated method stub
		System.out.println("Bite...");
	}
	@Override
	public void handle(DogHappyExceptions e) {
		// TODO Auto-generated method stub
		System.out.println("Happy...");
	}
}
abstract class DogExceptions extends Exception{
	public abstract void visit();
}
class DogBarkExceptions extends DogExceptions{
	String msg;
	public DogBarkExceptions(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
	@Override
	public void visit() {
		// TODO Auto-generated method stub
		ExceptionHandler eh=new Handler();
		eh.handle(this);
		
	}
}
class DogBiteExceptions extends DogExceptions{
	String msg;
	public DogBiteExceptions(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
	@Override
	public void visit() {
		// TODO Auto-generated method stub
		ExceptionHandler eh=new Handler();
		eh.handle(this);
		
	}
}
class DogHappyExceptions extends DogExceptions{
	String msg;
	public DogHappyExceptions(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
	@Override
	public void visit() {
		// TODO Auto-generated method stub
		ExceptionHandler eh=new Handler();
		eh.handle(this);
	}
}
