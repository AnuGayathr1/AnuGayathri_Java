package day5;

import java.util.*;

public class character extends Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//while (true) {
			System.out.println("Enter a character: ");
			char c = sc.next().charAt(0);
			try {
				if (!Character.isAlphabetic(c))
					throw new InputMismatchException();
			} catch (InputMismatchException e) {
				System.out.println("Enter an alphabet...");
			}
		//}
	}

}
