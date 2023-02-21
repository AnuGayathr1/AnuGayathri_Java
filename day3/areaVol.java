package day3;
import java.util.*;
interface calcArea{	
	public void Area();
}
interface calcVolume{
	public void Volume();
}
interface calcPerimeter{
	public void Perimeter();
}
interface calcSurfaceArea{
	public void Surface();
}
class circle implements calcArea, calcPerimeter{
	public float r;
	public double pi=3.14;
	public void Area() {
		System.out.println("Enter radius: ");
		Scanner sc=new Scanner(System.in);
		r=sc.nextFloat();
		double area= pi*r*r;
		System.out.println("Area of circle: "+area);
	}
	public void Perimeter() {
	
		double perimeter=2*pi*r;
		System.out.println("Perimeter of circle: "+perimeter);
	}
}
class square implements calcArea, calcPerimeter{
	public float a;
	public void Area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side: ");
		a=sc.nextFloat();
		double area=a*a;
		System.out.println("Area of square: "+area);
	}
	public void Perimeter() {
		double perimeter=4*a;
		System.out.println("Perimeter of square: "+perimeter);
	}
}
class triangle implements calcArea, calcPerimeter{
	public void Area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base: ");
		float b=sc.nextFloat();
		System.out.println("Enter height: ");
		float h=sc.nextFloat();
		double area=0.5*b*h;
		System.out.println("Area of triangle: "+area);
	}
	public void Perimeter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three sides of a traingle: ");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		double perimeter=s1+s2+s3;
		System.out.println("Perimeter of traingle: "+perimeter);
	}
}
class sphere implements calcArea, calcPerimeter, calcSurfaceArea, calcVolume{
	Scanner sc=new Scanner(System.in);
	public float r;
	public void Area() {
		System.out.println("Enter radius: ");
		r=sc.nextFloat();
		double area=3.14f*r*r;
		System.out.println("Area of sphere: "+area);
	}
	public void Perimeter()
	{
		double perimeter=2*3.14f*r;
		System.out.println("Perimeter of sphere: "+perimeter);	
	}
	public void Surface()
	{
		double sa=4*3.14*r*r;
		System.out.println("Surface Area of Sphere: "+sa);
	}
	public void Volume()
	{
		double volume=(4/3)*3.14f*r*r;
		System.out.println("Volume of sphere: "+volume);
	}
	
}
class cuboid implements calcArea, calcPerimeter, calcSurfaceArea, calcVolume{
	Scanner sc = new Scanner(System.in);
	public int s;
	public void Perimeter()
	{
		System.out.println("Enter side: ");
		s=sc.nextInt();
		int perimeter=4*s;
		System.out.println("Perimeter of cuboid: "+perimeter);
	}
	public void Area()
	{
		int area=s*s;
		System.out.println("Area of cuboid: "+area);
		
	}
	public void Surface()
	{
		int sa=6*s*s;
		System.out.println("Surface Area of cuboid: "+sa);
		
	}
	public void Volume()
	{
		int volume=s*s*s;
		System.out.println("Volume of cuboid: "+volume);
		
	}
}
public class areaVol {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		circle c= new circle();
		square s=new square();
		triangle t = new triangle();
		sphere sp = new sphere();
		cuboid cb=new cuboid();
		System.out.println("Enter choice");
		
		System.out.println("1.Circle");
		System.out.println("2.Square");
		System.out.println("3.Triangle");
		System.out.println("4.Sphere");
		System.out.println("5.Cuboid");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
		{
			c.Area();
			c.Perimeter();
			break;
		}
		case 2:
		{
			s.Area();
			s.Perimeter();
			break;
		}
		case 3:
		{
			t.Area();
			t.Perimeter();
			break;
		}
		case 4:
		{
			sp.Area();
			sp.Perimeter();
			sp.Surface();
			sp.Volume();
			break;
		}
		case 5:
		{
			cb.Area();
			cb.Perimeter();
			cb.Surface();
			cb.Volume();
			break;
		}
		}
	}
}
