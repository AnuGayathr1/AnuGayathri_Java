package Exercise4;
import java.util.*;
public class StrategyDemo {
public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	PaintBrush pb=new PaintBrush();
	String s=sc.next();
	s="Pattern."+s;
	pb.paint=(Paint)Class.forName(s).getConstructor().newInstance();
	pb.doPaint();
}
}
class PaintBrush{ 
	public PaintBrush() {
		// TODO Auto-generated constructor stub
	}
	Paint paint;
	public void doPaint() {
		paint.colour();
	}
}
abstract class Paint{
	public Paint() {
		// TODO Auto-generated constructor stub
	}
	public abstract void colour();
}
class RedPaint extends Paint{
	public RedPaint() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("Red colour...");
	}
}
class BluePaint extends Paint{ 
	public BluePaint() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("Blue colour...");
	}
}
class GreenPaint extends Paint{
	public GreenPaint() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("Green colour...");
	}
}