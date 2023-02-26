package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;

public class sample extends Thread {
	StringBuffer sb;

	public sample(StringBuffer sb) {
		// TODO Auto-generated constructor stub
		this.sb = sb;

	}

	public void run() {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {

			synchronized (sb) {
				Thread.currentThread().getName();
				for (int i = 1; i <= 100; i++) {
					System.out.print(sb + " ");
				}
				System.out.println();
				sb.setCharAt(0, (char) (sb.charAt(0) + 1));
			}
		});
		es.shutdown();
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A");
		sample t1 = new sample(sb);
		sample t2 = new sample(sb);
		sample t3 = new sample(sb);
		t1.start();
		t2.start();
		t3.start();
	}
}
