package day4;
import java.util.*;
public class numDiv {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
			System.out.println("Enter numerator: ");
			String num=sc.next();
			try {
				if(num.charAt(0)=='q'||num.charAt(0)=='Q') throw new InputMismatchException();
				if(!(Character.isDigit(num.charAt(0)))) throw new NumberFormatException();
			}catch(NumberFormatException e) {
			System.out.println("Enter a valid number");
			}catch(InputMismatchException e) {
				System.exit(0);
			}
			//String s1=Integer.toString(num);
			char c1=num.charAt(0);
			
			System.out.println("Enter divisor: ");
			String div=sc.next();
			
			//String s2=Integer.toString(div);
			char c2=div.charAt(0);
			try {
				if(!(Character.isDigit(div.charAt(0)))) throw new NumberFormatException();
			/*catch(NumberFormatException e) {
				System.out.println("Enter a valid number");
			}*/
//			if()
			System.out.println("Result: "+(Integer.parseInt(num)/Integer.parseInt(div)));
			
			//if(!(Character.isDigit(c2))) throw new NumberFormatException();
			}catch(ArithmeticException e){
				System.out.println("For divisor enter a value other than zero");
			}catch(NumberFormatException e) {
				System.out.println("Enter a valid number");
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
