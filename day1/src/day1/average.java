package day1;

import java.util.Scanner;

public class average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of values: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the values: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Average: "+average(a,n));
		sc.close();
	}
	public static  int average(int a[], int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		int res=sum/n;
		return res;
	}
}
