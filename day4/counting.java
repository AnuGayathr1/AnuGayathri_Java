package day4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class counting {
public static void main(String[] args) {
	
//		public void counting() {
//			//Thread t=new Thread();//1991 - my college first year
//			ExecutorService es=Executors.newFixedThreadPool(2);//2005- my marriage 2nd year
//			es.execute(()->{System.out.println("child thread called..");});
//			es.execute(()->{});
//			es.shutdown();
//		}
		
			Thread t=Thread.currentThread();
//			new ThreadDemo1();
			for(int i=0;i<5;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					
				}
			}
		
}
}
