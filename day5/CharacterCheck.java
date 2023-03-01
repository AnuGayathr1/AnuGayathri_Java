package day5;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class CharacterCheck extends Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExecutorService es=Executors.newFixedThreadPool(1);
		
		es.execute(()->{
			int count=0;
			while (true) {
				System.out.println("Enter a character: ");
				char c = sc.next().charAt(0);
				count++;
				try {
					if (!Character.isAlphabetic(c))
						throw new InputMismatchException();
				} catch (InputMismatchException e) {
					System.out.println("Enter an alphabet...");
					count--;
					continue;
				}
				System.out.println("The number of alphabets entered: "+count);
		}
		
		});
	}

}
