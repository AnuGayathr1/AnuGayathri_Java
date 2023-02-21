package day1;

import java.util.Scanner;

public class largest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		int r=sc.nextInt();
		System.out.println("Enter the no. of columns: ");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			int max=0;
			for(int j=0;j<c;j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
				
			}
			System.out.println(max);
		}
	}
}
