package day4;

import java.util.*;

public class averageExcep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 10 students: ");
		int sum = 0, index = 0;
		String marks[] = new String[10];
		while (index < 10) {
			try {
				marks[index] = sc.nextLine();
				int num = Integer.parseInt(marks[index]);
			} catch (NumberFormatException e) {
				System.out.println("Enter a valid number!!!");
				continue;

			}

			sum += Integer.parseInt(marks[index++]);
			System.out.println("Sum " + sum);
		}
		System.out.println("Average: " + sum / 10);
	}
}
