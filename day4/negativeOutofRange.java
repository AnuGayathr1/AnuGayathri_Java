package day4;

import java.util.*;

public class negativeOutofRange {
	public static void main(String[] args) {
		NegativeException ne = new NegativeException();
		OutOfBoundException obe = new OutOfBoundException();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 10 students: ");
		int sum = 0;
		String marks[] = new String[10];
		for (int index = 0; index < 10; index++) {
			try {
				marks[index] = sc.nextLine();
				if (Integer.parseInt(marks[index]) < 0)
					throw new NegativeException();
				if (!(Integer.parseInt(marks[index]) >= 0 && Integer.parseInt(marks[index]) <= 100))
					throw new OutOfBoundException();
			} catch (InputMismatchException e) {
				System.out.println("Enter a valid number");
				index--;
				continue;
			} catch (NegativeException e) {
				ne.NegativeException();
				index--;
				continue;
			} catch (OutOfBoundException e) {
				obe.OutOfBoundException();
				index--;
				continue;
			} catch (NumberFormatException e) {
				System.out.println("Enter a valid number!!!");
				index--;
				continue;
			}
			sum += Integer.parseInt(marks[index]);
		}
		System.out.println("Average: " + sum / 10);
	}

}

class NegativeException extends Exception {
	public void NegativeException() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter a positive number");
	}
}

class OutOfBoundException extends Exception {
	public void OutOfBoundException() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter a number within range 0 to 100");
	}
}
