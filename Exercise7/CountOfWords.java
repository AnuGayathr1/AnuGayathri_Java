package Exercise7;
import java.util.*;
public class CountOfWords {
public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		int count=1;
		for(int i=0;i<string.length()-1;i++) {
			if(string.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("Count of number of words: "+count);
	}
}


