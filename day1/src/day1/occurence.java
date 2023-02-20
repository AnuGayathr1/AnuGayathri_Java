package day1;

import java.util.Scanner;

public class occurence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of values: ");
		int n=sc.nextInt();
		int count=0;
		int a[]=new int[n];
		System.out.println("Enter the values: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to find: ");
		int find=sc.nextInt();
		System.out.println("Locations:");
		for(int i=0;i<n;i++)
		{
			if(a[i]==find)
			{
				System.out.println((i+1)+" ");
			    count++;
			}
		}
		System.out.println(find+" has occured "+count+" times");
		sc.close();
}
}