package day5;

public class NeverStart extends Thread{
	public void run() {
		System.out.println("Thread started...");
	}
	public static void main(String[] args) {
		NeverStart thread=new NeverStart();
		thread.start();
		thread.start();
	}
}
//A thread started once cannot be started again...Thread will run once but throws an exception the next time.