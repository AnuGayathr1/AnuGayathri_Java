package day4;
import java.util.*;

public class negativeOutofRange {
	public static void main(String[] args) {
		NegativeException ne=new NegativeException();
		OutOfBoundException obe=new OutOfBoundException();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of 10 students: ");
		int sum=0;
		String a[]=new String[10];
		for(int i=0;i<10;i++) {
			try {
				a[i]=sc.nextLine();
//				if(!(Character.isDigit(a[i].charAt(0)))) throw new InputMismatchException();
				if(Integer.parseInt(a[i])<0) throw new NegativeException();
				if(!(Integer.parseInt(a[i])>=0 && Integer.parseInt(a[i])<=100)) throw new OutOfBoundException(); 
			}catch(InputMismatchException e) {
				System.out.println("Enter a valid number");
				i--;
				continue;
			}
			catch(NegativeException e) {
				ne.NegativeException();
				i--;
				continue;
			}catch(OutOfBoundException e) {
				obe.OutOfBoundException();
				i--;
				continue;
			}
			catch(NumberFormatException e) {
				System.out.println("Enter a valid number!!!");
				i--;
				continue;
			}
			sum+=Integer.parseInt(a[i]);
			System.out.println("Sum "+sum);
		}
		System.out.println("Average: "+sum/10);
	}

}
class NegativeException extends Exception{
	public void NegativeException() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter a positive number");
	}
}
class OutOfBoundException extends Exception{
	public void OutOfBoundException() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter a number within range 0 to 100");
	}
}
