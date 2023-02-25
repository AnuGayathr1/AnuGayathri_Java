package day5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class threadEvenOdd {
	public static void main(String[] args) {
	EvenOdd eo=new EvenOdd();
	ExecutorService es=Executors.newFixedThreadPool(2);
	es.execute(()->{
		Thread.currentThread().setName("Even Numbers");
		synchronized(eo) {
			eo.even();
			//try {Thread.sleep(5000);}catch(Exception e) {}
		}
	});
	es.execute(()->{
		Thread.currentThread().setName("Odd Numbers");
		synchronized(eo) {
			eo.odd();	
			//try {Thread.sleep(5000);}catch(Exception e) {}
		}
	});
	
	es.shutdown();
}
}
class EvenOdd{
	 public void even() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name);
		for(int i=1;i<100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	 public void odd() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("\n"+name);
		for(int i=1;i<100;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
}
