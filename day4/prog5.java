package day4;
import java.util.*;
import day4.ownExcep.CatException;

public class prog5 {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String item=sc.next();
	prog5 p=new prog5();
	//p.catException(item);
}

public void catException(String item) throws CatException {
	if(item.equals("stone")) {
		throw new CatException();
		
	}
	else {
		System.out.println("Happyyy");
	}
}
}