package day2;

import java.util.*;

public class stack {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<>();
		System.out.println("Enter the values to push into stack:");
		s.push(sc.nextInt());
		s.push(sc.nextInt());
		s.push(sc.nextInt());
		System.out.println(s);
		System.out.println("Is stack empty? "+s.empty());
	}
}
