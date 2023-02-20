package day1;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp;
		System.out.println("Enter the no. of values: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the values: ");
		for(int i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		for(int i=0,x=n-1;i<x;i++,x--)
		{
			temp=a[i];
			a[i]=a[x];
			a[x]=temp;
		}
		System.out.println("Reversed Array");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
