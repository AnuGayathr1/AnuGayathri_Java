package day1;
import java.util.*;
public class display {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		int a[][]=new int[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				a[i][j]=sc.nextInt();
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		sc.close();
	}
}
