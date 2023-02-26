package day4;

import java.util.*;

public class numDiv {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Enter numerator: ");
				String num = sc.nextLine();
				int numerator = 0, denominator = 0;
				System.out.println(num);

				try {
					if (num.charAt(0) == 'q' || num.charAt(0) == 'Q') {
						System.exit(0);
					}
					numerator = Integer.parseInt(num);
				} catch (NumberFormatException e) {
					System.out.println("Enter a valid number");
					continue;
				}
				while (true) {
					System.out.println("Enter divisor: ");
					String div = sc.nextLine();
					System.out.println(div);

					try {
						denominator = Integer.parseInt(div);
						break;
					} catch (NumberFormatException e) {
						System.out.println("Enter a valid number");

					}
				}
				System.out.println("Result: " + (double) (numerator / denominator));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}