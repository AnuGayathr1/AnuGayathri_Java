package day1;

import java.util.Arrays;
import java.util.Scanner;

public class resize {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		a=Arrays.copyOf(a, n);
		System.out.println("New size of the array: "+a.length);
		sc.close();
	}
}
