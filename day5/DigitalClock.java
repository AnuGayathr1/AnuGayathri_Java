package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClock {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		
		es.execute(()->{
			int hour=0;
			int minute=0;
			int second=0;
			try {
				while(true) {
					System.out.printf("%02d : %02d : %02d\n",hour,minute,second);
					second++;
					if(second==60) {
						minute=minute+1;
						second=0;
					}
					if(minute==60) {
						hour=hour+1;
						minute=0;
					}
					if(hour==24) {
						hour=0;
						minute=0;
						second=0;
					}
					Thread.sleep(1000);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		});
		
	}
}
		