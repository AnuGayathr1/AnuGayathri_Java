package day4;
import java.util.*;
public class averageExcep {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of 10 students: ");
		int sum=0;
		String a[]=new String[10];
		for(int i=0;i<10;i++) {
			try {
				a[i]=sc.nextLine();
				if(!(Character.isDigit(a[i].charAt(0)))) throw new InputMismatchException();
				int num=Integer.parseInt(a[i]);
			}catch(InputMismatchException e) {
				System.out.println("Enter a valid number");
				i--;
				continue;
			}catch(NumberFormatException e) {
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

