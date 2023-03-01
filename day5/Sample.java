package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;

public class Sample extends Thread {
	StringBuffer sb;

	public Sample(StringBuffer sb) {
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
		Sample t1 = new Sample(sb);
		Sample t2 = new Sample(sb);
		Sample t3 = new Sample(sb);
		t1.start();
		t2.start();
		t3.start();
	}
}
