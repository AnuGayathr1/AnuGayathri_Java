package day4;
import java.util.*;
public class ownExcep {
		public static void main(String[] args) throws Exception{
			Scanner sc=new Scanner(System.in);
				        Cat cat=new Cat();
						System.out.println("before exception...");
						System.out.println("Enter an item: ");
						String item=sc.next();
						try {
							cat.play(item);
						}/*catch(Exception e) {
							System.out.println(e);
						}*/
						finally {
							System.out.println("finally called....");
						}
						System.out.println("after exception....");
					
				}
}
			class Cat{
				public void play(String item)throws Exception {
					if(item.equals("biscuit")) {
						System.out.println("happy happy yummy yummy...");
					}
					else if(item.equals("stick")) {
						throw new Exception();
					}
				}
			}

