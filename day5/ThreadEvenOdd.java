package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadEvenOdd {
	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {
			Thread.currentThread().setName("Even Numbers");
			synchronized (eo) {
				eo.even();
			}
		});
		es.execute(() -> {
			Thread.currentThread().setName("Odd Numbers");
			synchronized (eo) {
				eo.odd();
			}
		});

		es.shutdown();
	}
}

class EvenOdd {
	public void even() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name);
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
	}
	public void odd() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("\n" + name);
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
	}
}
