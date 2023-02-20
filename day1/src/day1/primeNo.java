package day1;

import java.util.Scanner;

public class primeNo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
		s.close();
	}
}
