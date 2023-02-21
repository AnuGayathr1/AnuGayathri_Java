package day1;

import java.util.Scanner;

public class number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		boolean a = perfect(n);
		System.out.println("Perfect: "+a);
		boolean b = armstrong(n);
		System.out.println("Armstrong: "+b);
		boolean c = palindrome(n);
		System.out.println("Palindrome: "+c);
	}
	public static boolean perfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
			return true;
		else
			return false;

	}
	public static boolean armstrong(int n) 
	{
		int size=0,r;
		double sum=0;
		int x=n;
		while(x!=0)
		{
			x=x/10;
			size++;
		}
		x=n;
		while(x!=0)
		{
			r=x%10;
			sum=sum+Math.pow(r, size);
			x=x/10;
		}
		
		if(sum==n)
			return true;
		else
			return false;
		
	}
	public static boolean palindrome(int n)
	{
		int rev=0;
		int x=n;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==x)
			return true;
		else
			return false;
	}
}
