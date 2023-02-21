package day1;

import java.util.Scanner;

public class sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp=0;
		System.out.println("Enter the no. of values: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the values: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nDescending Order");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
