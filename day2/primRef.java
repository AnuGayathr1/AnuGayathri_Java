package day2;

public class primRef {
	public static void change(int[] array) {
		array[0]=10;
	}
	public static void changePrim(int a) {
		a=90;
	}
	public static void main(String[] args) {
		int array[]=new int[10];
		array[0]=1;
		System.out.println(array[0]);
		change(array);
		System.out.println(array[0]);
		int b=100;
		System.out.println(b);	
		changePrim(b);
		System.out.println(b);
	}
}
