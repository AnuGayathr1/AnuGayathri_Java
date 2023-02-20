package day1;

import java.util.Scanner;

public class marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of students");
		int n=sc.nextInt();
		System.out.println("Enter the no. of subjects");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			System.out.println("Student "+(i+1));
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int result[]=new int[n];
		System.out.println("Results");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				result[i]+=a[i][j];
				
			}
			System.out.println("Student "+(i+1)+":"+result[i]);
		}
		sc.close();
	}
}
