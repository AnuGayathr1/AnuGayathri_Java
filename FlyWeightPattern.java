package flyweightPatternDemo;
import java.util.*;
import java.util.HashMap;

public class FlyWeightPattern {
	private static final String colors[]= {"Red","Green","Blue","Yellow"};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
	         Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
	         System.out.println("Enter the radius of the circle: ");
	         circle.setRadius(10);
	         circle.create();
	         }
	}
	private static String getRandomColor() {
		return colors[(int)(Math.random()*colors.length)];
	}
}
interface Shape {
	void create();
}
class Circle implements Shape{
	private String color;
	private int radius;
	public Circle(String color) {
		this.color=color;
	}
	public void setRadius(int radius) {
		this.radius=radius;
	}
	@Override
	public void create() {
		System.out.println("Circle of color: "+color+" and radius: "+radius+" is created...\n");
		
	}
}
class ShapeFactory{
	private static final HashMap<String, Circle> circleMap=new HashMap<>();
	public static Shape getCircle(String color) {
		Circle circle=(Circle)circleMap.get(color);
		if(circle==null) {
			circle=new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Created circle of color "+color);
		}
		return circle;
	}
}
