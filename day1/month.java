package day1;

import java.util.Scanner;

public class month {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month:");
		String s=sc.next();
		switch(s)
		{
		case "Jan":
		{
			System.out.println("31 days");
			break;
		}
		case "Feb":
		{
			System.out.println("Enter the year: ");
			int y=sc.nextInt();
			if(y%4==0 && y%100!=0 || y%400==0)
			    System.out.println("29 days");
			else
				System.out.println("28 days");
			break;
		}
		case "Mar":
		{
			System.out.println("31 days");
			break;
		}
		case "Apr":
		{
			System.out.println("30 days");
			break;
		}
		case "May":
		{
			System.out.println("31 days");
			break;
		}
		case "Jun":
		{
			System.out.println("30 days");
			break;
		}
		case "Jul":
		{
			System.out.println("31 days");
			break;
		}
		case "Aug":
		{
			System.out.println("31 days");
			break;
		}
		case "Sep":
		{
			System.out.println("30 days");
			break;
		}
		case "Oct":
		{
			System.out.println("31 days");
			break;
		}
		case "Nov":
		{
			System.out.println("30 days");
			break;
		}
		case "Dec":
		{
			System.out.println("31 days");
			break;
		}
		}
	}
}
