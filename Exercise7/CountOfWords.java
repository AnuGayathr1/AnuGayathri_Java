package Exercise7;
import java.util.*;
public class CountOfWords {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("Count of number of words: "+count);
	}
	
}

