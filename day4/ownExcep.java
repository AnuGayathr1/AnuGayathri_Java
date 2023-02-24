package day4;
import java.util.*;
public class ownExcep {
		public static void main(String[] args) throws Exception{
			Scanner sc=new Scanner(System.in);
			ownExcep oe=new ownExcep();
						System.out.println("before exception...");
						System.out.println("Enter an item: ");
						String item=sc.next();
						try {
							oe.catException(item);
						}catch(Exception e) {
							e.printStackTrace();
							//System.out.println(e);
						}
						finally {
							System.out.println("finally called....");
						}
						System.out.println("after exception....");
					
				}
		    public void catException(String item) throws Exception {
			if(item.equals("stone")) {
				throw new CatException();
				
			}
			else {
				System.out.println("Happyyy");
			}
}
			class CatException extends Exception{
				public CatException() {
					// TODO Auto-generated constructor stub
					System.out.println("Sadddd...");
					
				}
				}
			}

