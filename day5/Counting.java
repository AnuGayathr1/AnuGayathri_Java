package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Counting {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			if (i % 10 == 0) {
				System.out.println("Printed 10 numbers");
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
