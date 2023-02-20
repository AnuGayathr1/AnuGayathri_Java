package day1;

import java.util.Scanner;
public class location {
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
	int find=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		if(a[i]==find)
			System.out.println(i);
		break;
	}
	sc.close();
}
}
