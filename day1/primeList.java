package day1;

import java.util.Scanner;

public class primeList {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Prime Numbers");
		int flag=0;
		
		int n;
		for( n=2;n<=100;n++)
		{
			flag=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			System.out.println(n);
		}
		s.close();
}
}
