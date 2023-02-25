package day5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class inventory {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		ProduceConsume pc=new ProduceConsume();
		es.execute(()->{
			for(int i=0;i<5;i++) {
				pc.produce();
			}
		});
		es.execute(()->{
			for(int i=0;i<5;i++) {
				pc.consume();
			}
		});
		es.shutdown();
	}
}
class ProduceConsume{
	boolean flag=false;
	synchronized public void produce() {
		if(flag) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("Produce: Product is produced....");
		flag=true;
		notify();
	}
	
	synchronized public void consume() {
		if(!flag) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("Consume: Product is consumed....");
		flag=false;
		notify();
	}
}