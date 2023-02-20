package day1;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		sc.close();
}
}
