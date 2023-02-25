package day5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class message {
	public static void main(String[] args) {
		PrintMessage m=new PrintMessage();
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(()->{
			Thread.currentThread().setName("Message 1");
			//synchronized(m) {
				m.display();
				//try {Thread.sleep(5000);}catch(Exception e) {}
			//}
		});
		es.execute(()->{
			Thread.currentThread().setName("Message 2");
			//synchronized(m) {
				m.display();
				//try {Thread.sleep(5000);}catch(Exception e) {}
			//}
		});
		es.execute(()->{
			Thread.currentThread().setName("Message 3");
			//synchronized(m) {
				m.display();
				//try {Thread.sleep(5000);}catch(Exception e) {}
			//}
		});
	}
}
class PrintMessage{
	void display(){
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("[------"+name+"------]");
	}
}
