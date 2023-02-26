package day1;

public class typeCast {
	public static void main(String[] args) {
		int a=50;
		double d=100;
		long l=a;
		//int i=l;
		float f=l;
		//int i1=f;
		//float f1=d;
		double d1=f;
		System.out.println("Implicit Type Conversion");
		System.out.println("Int value: "+a);
		System.out.println("Long Value: "+l);
		System.out.println("Float Value: "+f);
		System.out.println("Double value: "+d1);
		System.out.println("Explicit Type Conversion");
		byte b;
		int i=257;
		double d2=323.142d;
		b=(byte)i;
		System.out.println("i= "+i+" b= "+b);
		i=(int)d2;
		System.out.println("d= "+d2+" b= "+i);
		b=(byte)d2;
		System.out.println("d= "+d2+" b= "+b);
	}
}
