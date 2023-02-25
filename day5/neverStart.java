package day5;

public class neverStart extends Thread{
	public void run() {
		System.out.println("Thread started...");
	}
	public static void main(String[] args) {
		neverStart t=new neverStart();
		t.start();
		t.start();
	}
}
